package com.femirion.rootthegame.model.out.transformer;

import com.femirion.rootthegame.model.Transformer;
import com.femirion.rootthegame.model.core.Faction;
import com.femirion.rootthegame.model.out.FactionInfo;
import org.springframework.stereotype.Component;

@Component
public class FactionTransformer implements Transformer<Faction, FactionInfo> {
    @Override
    public FactionInfo transform(Faction entity) {
        return new FactionInfo(entity.getName(),
                               entity.getDesc(),
                               entity.isOfficial()
        );
    }
}
