package com.gamelist.models;

public class Game {
    private int id;
    private String name;
    private String publisher;

    public Game(int id, String name, String publisher) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getPublisher() {
        return publisher;
    }


    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
