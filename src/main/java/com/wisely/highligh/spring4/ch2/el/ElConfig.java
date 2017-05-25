package com.wisely.highligh.spring4.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;

/**
 * Created by kelvin on 17/5/22.
 */
public class ElConfig {
    @Value("I love You!")
    private String normal;
    @Value("#{systemProperties['os.name']}")
    private String osName;
    @Value("#{T(java.lang.Math).random() * 100.0}")
    private String randomNumber;
    @Value("#{demoService.another}")
    private String fromAnother;
    @Value("classpath:com/wisely/h")
    private Resource testFile;

}
