package com.femirion.rootthegame.model.core;

import com.femirion.rootthegame.model.type.FactionType;
import lombok.Data;

@Data
public abstract class Faction {
    private final FactionType type;
    private final String name;
    private final String desc;
    private final boolean official;
    private final int maxCountOfUnit;
    private final int startCountOfUnit;

    private int currentCountOfUnit;
    private int currentVictoryPoints;
}
