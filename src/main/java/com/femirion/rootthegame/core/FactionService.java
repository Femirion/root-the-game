package com.femirion.rootthegame.core;

import com.femirion.rootthegame.model.core.Faction;
import com.femirion.rootthegame.model.core.faction.Marquise;
import com.femirion.rootthegame.model.type.FactionType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class FactionService {
    private static final String ERROR_MSG = "can not find faction with name=%s";
    private final Map<FactionType, Faction> factions = Map.of(
            FactionType.MARQUISE_DE_CAT, new Marquise(FactionType.MARQUISE_DE_CAT,"MARQUISE_DE_CAT_NAME", "MARQUISE_DE_CAT_DESC", true, 3, 6),
            FactionType.DYNASTIES, new Marquise(FactionType.DYNASTIES, "DYNASTIES_NAME", "DYNASTIES_DESC", true, 3, 6),
            FactionType.WOODLAND_ALLIANCE, new Marquise(FactionType.WOODLAND_ALLIANCE,"WOODLAND_ALLIANCE_NAME", "WOODLAND_ALLIANCE_DESC", true, 3, 6),
            FactionType.VAGABOND, new Marquise(FactionType.VAGABOND,"VAGABOND_NAME", "VAGABOND_DESC", true, 3, 6));

    public Faction getFaction(FactionType faction) {
        return Optional.ofNullable(factions.get(faction))
                       .orElseThrow(() -> new IllegalArgumentException(String.format(ERROR_MSG, faction)));
    }

    public List<Faction> getFactions() {
        return new ArrayList<>(factions.values());
    }
}
