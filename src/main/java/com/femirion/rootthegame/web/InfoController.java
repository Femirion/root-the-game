package com.femirion.rootthegame.web;

import com.femirion.rootthegame.core.FactionService;
import com.femirion.rootthegame.model.out.FactionInfo;
import com.femirion.rootthegame.model.out.transformer.FactionTransformer;
import com.femirion.rootthegame.model.type.FactionType;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RestController
@RequestMapping("/info")
public class InfoController {
    private final FactionService factionService;
    private final FactionTransformer factionTransformer;

    @GetMapping("/factions/{faction}")
    public FactionInfo getFactions(@PathVariable FactionType faction) {
        return factionTransformer.transform(factionService.getFaction(faction));
    }

    @GetMapping("/factions")
    public List<FactionInfo> getFactions() {
        return factionService.getFactions().stream()
                .map(factionTransformer::transform)
                .collect(Collectors.toList());
    }
}
