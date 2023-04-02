package com.springlearning.javagamingapp;

import com.springlearning.javagamingapp.game.GameRunner;
import com.springlearning.javagamingapp.game.SuperContraGame;

public class App001GamingBasicJava {

    public static void main (String[] agrs) {
        //var game =  new MarioGame();
        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
