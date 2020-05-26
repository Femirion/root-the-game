package com.femirion.rootthegame.model.core.world.element;

import com.femirion.rootthegame.model.type.FactionType;
import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Token {
    private FactionType factionType;
}
