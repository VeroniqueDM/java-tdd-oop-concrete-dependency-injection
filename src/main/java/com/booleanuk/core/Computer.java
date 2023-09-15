package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    PowerSupply psu;
    private ArrayList<Game> installedGames;

    public Computer(PowerSupply powerSupply) {
        this.installedGames = new ArrayList<>();
        this.psu = powerSupply;
    }

    public Computer(PowerSupply psu, ArrayList<Game> installedGames) {
        this.psu = psu;
        this.installedGames = installedGames;
    }

    public PowerSupply getPsu() {
        return psu;
    }

    public void setPsu(PowerSupply psu) {
        this.psu = psu;
    }

    public ArrayList<Game> getInstalledGames() {
        return installedGames;
    }

    public void setInstalledGames(ArrayList<Game> installedGames) {
        this.installedGames = installedGames;
    }

    public void turnOn() {

        psu.turnOn();
    }

    public void installGame(Game game) {
//        Game game = new Game(gameName);
        this.installedGames.add(game);
    }

    public String playGame(Game game) {
        for (Game g : this.installedGames) {
            if (g.equals(game)) {
                return g.start();
            }
        }

        return "Game not installed";
    }
}
