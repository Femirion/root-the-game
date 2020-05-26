package com.femirion.rootthegame.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class InfoControllerTest {
    private static final String FACTION_INFOS_URL = "/info/factions";

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getFactionInfo() throws Exception {
        mockMvc.perform(get(FACTION_INFOS_URL + "/VAGABOND"))
               .andExpect(status().isOk())
               .andExpect(content().json("{\"name\":\"VAGABOND_NAME\",\"desc\":\"VAGABOND_DESC\",\"official\":true}"));
    }

    @Test
    public void getFactionInfos() throws Exception {
        mockMvc.perform(get(FACTION_INFOS_URL))
               .andExpect(status().isOk())
               .andExpect(content().json("[" +
                                                 "{\"name\":\"VAGABOND_NAME\",\"desc\":\"VAGABOND_DESC\",\"official\":true}," +
                                                 "{\"name\":\"DYNASTIES_NAME\"," +
                                                 "\"desc\":\"DYNASTIES_DESC\",\"official\":true}," +
                                                 "{\"name\":\"WOODLAND_ALLIANCE_NAME\"," +
                                                 "\"desc\":\"WOODLAND_ALLIANCE_DESC\",\"official\":true}," +
                                                 "{\"name\":\"MARQUISE_DE_CAT_NAME\"," +
                                                 "\"desc\":\"MARQUISE_DE_CAT_DESC\",\"official\":true}" +
                                                 "]"));
    }
}