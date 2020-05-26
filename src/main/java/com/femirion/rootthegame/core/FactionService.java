package com.femirion.rootthegame.core;

import com.femirion.rootthegame.model.out.FactionInfo;
import com.femirion.rootthegame.model.type.Faction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class FactionService {
    private static final String ERROR_MSG = "can not find faction with name=%s";
    private final Map<Faction, FactionInfo> factions = Map.of(
            Faction.MARQUISE_DE_CAT, new FactionInfo("MARQUISE_DE_CAT_NAME", "MARQUISE_DE_CAT_DESC", true),
            Faction.EYRIE_DYNASTIES, new FactionInfo("EYRIE_DYNASTIES_NAME", "EYRIE_DYNASTIES_DESC", true),
            Faction.WOODLAND_ALLIANCE, new FactionInfo("WOODLAND_ALLIANCE_NAME", "WOODLAND_ALLIANCE_DESC", true),
            Faction.VAGABOND, new FactionInfo("VAGABOND_NAME", "VAGABOND_DESC", true));

    public List<FactionInfo> getFactions() {
        return new ArrayList<>(factions.values());
    }

    public FactionInfo getFaction(Faction faction) {
        return Optional.ofNullable(factions.get(faction))
                       .orElseThrow(() -> new IllegalArgumentException(String.format(ERROR_MSG, faction)));
    }
}
