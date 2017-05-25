package com.wisely.highligh.spring4.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by kelvin on 17/5/22.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnocationService demoAnnocationService = context.getBean(DemoAnnocationService.class);
        DemoMethodService demomMethodService = context.getBean(DemoMethodService.class);
        demoAnnocationService.add();
        demomMethodService.add();
        context.close();
    }
}
