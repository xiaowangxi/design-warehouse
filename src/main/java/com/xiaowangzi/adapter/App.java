package com.xiaowangzi.adapter;

public final class App {
    private App() {
    }

    public static void main(final String[] args) {
        // The captain can only operate rowing boats but with adapter he is able to
        // use fishing boats as well
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
