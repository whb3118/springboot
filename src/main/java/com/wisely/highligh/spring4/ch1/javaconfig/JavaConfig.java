package com.wisely.highligh.spring4.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kelvin on 17/5/19.
 */
@Configuration
public class JavaConfig {
    @Bean
    public FunctionService functionService(){
       return new FunctionService();
    }
//    @Bean
//    public UseFunctionService useFunctionService(){
//        UseFunctionService useFunctionService = new UseFunctionService();
//        useFunctionService.setFunctionService(functionService());
//        return useFunctionService;
//    }
    @Bean
    public UseFunctionService useFunctionService(FunctionService functionService){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService);
        return useFunctionService;
    }
}
