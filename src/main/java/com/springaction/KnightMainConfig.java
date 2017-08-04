package com.springaction;

import com.springaction.knights.Knight;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by kelvin on 17/8/1.
 */
public class KnightMainConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.springaction.KnightConfig.class);
        Knight knight =  context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
