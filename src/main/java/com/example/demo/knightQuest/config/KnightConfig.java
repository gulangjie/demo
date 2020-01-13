package com.example.demo.knightQuest.config;

import com.example.demo.knightQuest.BraveKnight;
import com.example.demo.knightQuest.Knight;
import com.example.demo.knightQuest.Quest;
import com.example.demo.knightQuest.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {
    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }


}
