package com.xiaowangzi.abstractDocument;

import com.xiaowangzi.abstractDocument.domain.Car;
import com.xiaowangzi.abstractDocument.domain.enums.Property;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * 抽象文档模式
 */
@Slf4j
public class App {

    public static void main(String[] args) {
        log.info("Constructing parts and car");

        Map<String, Object> wheelProperties = Map.of(Property.TYPE.toString(), "wheel",
                Property.MODEL.toString(), "15C",
                Property.PRICE.toString(), 100L);

        Map<String, Object> doorProperties = Map.of(
                Property.TYPE.toString(), "door",
                Property.MODEL.toString(), "Lambo",
                Property.PRICE.toString(), 300L);

        Map<String, Object> carProperties = Map.of(
                Property.MODEL.toString(), "300SL",
                Property.PRICE.toString(), 10000L,
                Property.PARTS.toString(), List.of(wheelProperties, doorProperties));
        Car car = new Car(carProperties);

        car.getParts().forEach(p -> log.info("\t{}/{}/{}",
                p.getType().orElse(null),
                p.getModel().orElse(null),
                p.getPrice().orElse(null)));
    }

}
