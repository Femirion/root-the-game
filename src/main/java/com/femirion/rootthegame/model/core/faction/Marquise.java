package com.femirion.rootthegame.model.core.faction;

import com.femirion.rootthegame.model.core.Faction;
import com.femirion.rootthegame.model.type.FactionType;

public class Marquise extends Faction {
    public Marquise(FactionType factionType, String name, String desc, boolean official, int maxCountOfUnit, int startCountOfUnit) {
        super(factionType, name, desc, official, maxCountOfUnit, startCountOfUnit);
    }
}
