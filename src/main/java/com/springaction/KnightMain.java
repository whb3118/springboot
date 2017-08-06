package com.springaction;

import com.springaction.knights.Knight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kelvin on 17/8/1.
 */
public class KnightMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/knights2.xml");
        Knight knight =  context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
