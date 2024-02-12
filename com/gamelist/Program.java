package com.gamelist;

import java.util.LinkedList;

import com.gamelist.api.GameController;
import com.gamelist.models.Game;
import com.helpers.parser.StringToInteger;

public class Program {
    public static void main(String[] args) {
        LinkedList<Game> games = new GameController().getGamesList();

        for (Game game : games) {
            System.out.printf("%d. %s\n", games.indexOf(game) + 1, game.getName());
        }
        System.out.print("Please enter a number to choose a game: ");

        int userChoice = StringToInteger.parseInRange(1, games.size());
        Game userGame = games.get(userChoice - 1);

        System.out.println();
        System.out.printf("Name:\t\t%s\n", userGame.getName());
        System.out.printf("Published by:\t%s\n", userGame.getPublisher());

        System.out.print("Please enter a number: ");
        userChoice = StringToInteger.parse();
        System.out.println(userChoice);

        System.out.print("Please enter a number: ");
        userChoice = StringToInteger.parseNatural();
        System.out.println(userChoice);
    }
}