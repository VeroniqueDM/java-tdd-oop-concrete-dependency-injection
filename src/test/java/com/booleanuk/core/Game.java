package com.booleanuk.core;

import java.util.Objects;

public class Game {
    public String name;

    public Game(String name) {
        this.name = name;
    }

    public String start() {
        return "Playing " + this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(name, game.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
