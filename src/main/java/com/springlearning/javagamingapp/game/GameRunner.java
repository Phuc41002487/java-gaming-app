package com.springlearning.javagamingapp.game;

public class GameRunner {
    private GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.right();
        game.actionA();
        game.up();
        game.down();
        game.actionB();
        game.left();
    }
}
