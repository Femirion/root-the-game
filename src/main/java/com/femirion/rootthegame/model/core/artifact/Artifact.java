package com.femirion.rootthegame.model.core.artifact;

import lombok.Getter;

@Getter
public abstract class Artifact {
    private final String name;
    private final int victoryPoint;

    public Artifact(String name, int victoryPoint) {
        this.name = name;
        this.victoryPoint = victoryPoint;
    }
}
