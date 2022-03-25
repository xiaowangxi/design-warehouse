package com.xiaowangzi.abstractDocument;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
public class AbstractDocumentTest {
    private static final String KEY = "key";
    private static final String VALUE = "value";

    private static class DocumentImplementation extends AbstractDocument {

        DocumentImplementation(Map<String, Object> properties) {
            super(properties);
        }
    }

    private final DocumentImplementation document = new DocumentImplementation(new HashMap<>());

    @Test
    void shouldPutAndGetValue() {
        document.put(KEY, VALUE);
        assertEquals(VALUE, document.get(KEY));
    }

    @Test
    void shouldRetrieveChildren() {
        List<Object> children = List.of(Map.of(), Map.of());

        document.put(KEY, children);

        Stream childrenStream = document.children(KEY, DocumentImplementation::new);
        assertNotNull(children);
        assertEquals(2, childrenStream.count());
    }

    @Test
    void shouldRetrieveEmptyStreamForNonExistingChildren() {
        Stream children = document.children(KEY, DocumentImplementation::new);
        assertNotNull(children);
        assertEquals(0, children.count());
    }

    @Test
    void shouldIncludePropsInToString() {
        Map<String,Object> props = Map.of(KEY, (Object) VALUE);
        DocumentImplementation document = new DocumentImplementation(props);
        assertTrue(document.toString().contains(KEY));
        assertTrue(document.toString().contains(VALUE));
    }
}
