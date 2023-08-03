package org.example.robo.config;

import org.example.robo.impl.robo.ModelT2000;
import org.example.robo.impl.sony.SonyLeg;
import org.example.robo.impl.toshiba.ToshibaHand;
import org.example.robo.impl.toshiba.ToshibaLeg;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfig {

//    @Bean //(name = "modelT1000")
//    public ModelT1000 modelT1000() {
//        return new ModelT1000();
//    }

//    @Bean
//    public SonyHand sonyHead() {
//        return new SonyHand();
//    }

//    @Bean
//    public SonyLeg sonyLeg() {
//        return new SonyLeg();
//    }

    @Bean
    public ModelT2000 t2000v1() {
        return new ModelT2000(new ToshibaHand(), new ToshibaLeg());
    }

    @Bean
    @Scope("singleton")
    public ModelT2000 t2000v2() {
        return new ModelT2000(new ToshibaHand(), new ToshibaLeg(), "silver");
    }

    @Bean
    @Scope("prototype")
    public ModelT2000 t2000v3() {
        return new ModelT2000(new ToshibaHand(), new SonyLeg(), "black");
    }

    @Bean (initMethod = "init", destroyMethod = "destroy")
    @Scope("prototype")
    public ModelT2000 t2000v4() {
        return new ModelT2000(new ToshibaHand(), new SonyLeg(), "white");
    }
}
