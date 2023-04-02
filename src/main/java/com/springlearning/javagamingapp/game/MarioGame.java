package com.springlearning.javagamingapp.game;

public class MarioGame implements GamingConsole {

    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Go into a hole");
    }

    public void left() {
        System.out.println("Go left");
    }

    public void right() {
        System.out.println("Go right");
    }

    public void actionA() {
        System.out.println("Accelerate");
    }

    public void actionB() {
        System.out.println("Fire");
    }
}
