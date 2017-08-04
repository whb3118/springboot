package com.springaction;

import com.springaction.knights.BraveKnight;
import com.springaction.knights.Knight;
import com.springaction.knights.Quest;
import com.springaction.knights.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kelvin on 17/8/1.
 */
@Configuration
public class KnightConfig {
    @Bean
    public Knight  knight(){
        return new BraveKnight(quest());
    }
    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }
}
