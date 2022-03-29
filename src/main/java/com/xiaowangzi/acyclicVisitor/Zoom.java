package com.xiaowangzi.acyclicVisitor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Zoom implements Modem {
    @Override
    public void accept(ModemVisitor modemVisitor) {
        if (modemVisitor instanceof ZoomVisitor) {
            ((ZoomVisitor) modemVisitor).visit(this);
        } else {
            log.info("Only ZoomVisitor is allowed to visit Zoom modem");
        }
    }

    @Override
    public String toString() {
        return "Zoom modem";
    }
}
