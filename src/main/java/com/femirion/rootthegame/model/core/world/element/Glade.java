package com.femirion.rootthegame.model.core.world.element;

import com.femirion.rootthegame.model.core.Unit;
import com.femirion.rootthegame.model.type.FactionType;
import com.femirion.rootthegame.model.type.Suit;

import java.util.List;

public class Glade {
    private Suit suit;
    private int countOfSpot;
    private FactionType owner;
    private List<Token> tokens;
    private List<Ruins> ruins;
    private List<Unit> units;
    private List<Building> buildings;
}
