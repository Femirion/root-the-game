package com.femirion.rootthegame.model.core;

import com.femirion.rootthegame.model.type.FactionType;

public interface Action {
    World doAction(FactionType currentFaction, World world);
}
