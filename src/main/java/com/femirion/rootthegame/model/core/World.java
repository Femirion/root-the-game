package com.femirion.rootthegame.model.core;

import com.femirion.rootthegame.model.core.world.element.Glade;
import com.femirion.rootthegame.model.core.world.element.Path;
import com.femirion.rootthegame.model.type.FactionType;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class World {
    private List<Glade> glades;
    private List<Path> paths;
    private Map<FactionType, Faction> factions;
}
