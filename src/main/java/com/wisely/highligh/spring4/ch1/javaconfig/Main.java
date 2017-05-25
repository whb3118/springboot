package com.wisely.highligh.spring4.ch1.javaconfig;

import com.wisely.highligh.spring4.ch1.di.DiConfig;
import com.wisely.highligh.spring4.ch1.di.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by kelvin on 17/5/19.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        com.wisely.highligh.spring4.ch1.di.UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.SayHello("java config"));
        context.close();
    }
}
