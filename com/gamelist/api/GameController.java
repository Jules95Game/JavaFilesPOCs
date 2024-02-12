package com.gamelist.api;

import java.util.LinkedList;
import com.gamelist.models.Game;

public class GameController {
    private LinkedList<Game> gamesList = new LinkedList<Game>();

    private void addGames() {
        gamesList.add(new Game(1, "Mario", "Nintendo"));
        gamesList.add(new Game(2, "Zelda", "Nintendo"));
        gamesList.add(new Game(3, "Rayman", "UbiSoft"));
        gamesList.add(new Game(4, "Spyro", "Sony"));
        gamesList.add(new Game(5, "Genshin Impact", "HoYoverse/miHoYo"));
    }


    public GameController() {
        addGames();
    }


    public LinkedList<Game> getGamesList() {
        return gamesList;
    }
}
