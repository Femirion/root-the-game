package com.femirion.rootthegame.model.out;

import lombok.AllArgsConstructor;
import lombok.Value;

@AllArgsConstructor
@Value
public class FactionInfo {
    private String name;
    private String desc;
    private boolean official;
}
