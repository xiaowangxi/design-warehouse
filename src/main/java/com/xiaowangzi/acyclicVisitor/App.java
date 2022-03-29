package com.xiaowangzi.acyclicVisitor;

public class App {
    public static void main(String[] args) {
        ConfigureForDosVisitor conDos = new ConfigureForDosVisitor();
        ConfigureForUnixVisitor conUnix = new ConfigureForUnixVisitor();

        Zoom zoom = new Zoom();
        Hayes hayes = new Hayes();

        hayes.accept(conDos);
        zoom.accept(conDos);
        hayes.accept(conUnix);
        zoom.accept(conUnix);
    }
}
