package com.springlearning.javagamingapp.game;

public class SuperContraGame implements GamingConsole {

    public void up() {
        System.out.println("Look upe");
    }

    public void down() {
        System.out.println("Sit down");
    }

    public void left() {
        System.out.println("Go left");
    }

    public void right() {
        System.out.println("Go right");
    }

    public void actionA() {
        System.out.println("Fire");
    }

    public void actionB() {
        System.out.println("Bomb");
    }
}
