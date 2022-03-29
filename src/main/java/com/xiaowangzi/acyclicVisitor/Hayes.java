package com.xiaowangzi.acyclicVisitor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Hayes implements Modem {
    @Override
    public void accept(ModemVisitor modemVisitor) {
        if (modemVisitor instanceof HayesVisitor) {
            ((HayesVisitor) modemVisitor).visit(this);
        } else {
            log.info("Only HayesVisitor is allowed to visit Hayes modem");
        }
    }

    @Override
    public String toString() {
        return "Hayes modem";
    }
}
