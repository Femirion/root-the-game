package com.femirion.rootthegame.web;

import com.femirion.rootthegame.core.FactionService;
import com.femirion.rootthegame.model.out.FactionInfo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/info")
public class InfoController {
    private final FactionService factionService;

    @GetMapping("/factions")
    public List<FactionInfo> getFactions() {
        return factionService.getFactions();
    }
}
