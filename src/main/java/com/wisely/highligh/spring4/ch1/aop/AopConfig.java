package com.wisely.highligh.spring4.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by kelvin on 17/5/22.
 */
@Configuration
@ComponentScan("com.wisely.highligh.spring4.ch1.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
