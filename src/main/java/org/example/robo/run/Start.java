package org.example.robo.run;

import org.example.robo.config.AppConfig;
import org.example.robo.impl.robo.ModelT1000;
import org.example.robo.impl.robo.ModelT2000;
import org.example.robo.impl.robo.ModelT3000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("===1");
        ModelT1000 robotT1000 = context.getBean(ModelT1000.class);
        robotT1000.dance();
        robotT1000.action();

        System.out.println("===2");
        Object robotObj1 = context.getBean("modelT1000");
        if (robotObj1 instanceof ModelT1000 robotT1000v2) {
            robotT1000v2.dance();
            robotT1000v2.action();
        }

        System.out.println("===3");
        Object robotObj2 = context.getBean("t2000v1");
        if (robotObj2 instanceof ModelT2000 robotT2000) {
            robotT2000.dance();
            robotT2000.action();
        }

        System.out.println("===4");
        Object robotObj3 = context.getBean("t2000v2");
        if (robotObj3 instanceof ModelT2000 robotT2000) {
            robotT2000.dance();
            robotT2000.action();
        }

        System.out.println("===5");
        Object robotObj4 = context.getBean("t2000v2");
        if (robotObj4 instanceof ModelT2000 robotT2000) {
            robotT2000.dance();
            robotT2000.action();
        }

        System.out.println("===6");
        Object robotObj5 = context.getBean("t2000v3");
        if (robotObj5 instanceof ModelT2000 robotT2000) {
            robotT2000.dance();
            robotT2000.action();
        }

        System.out.println("===7");
        Object robotObj6 = context.getBean("t2000v3");
        if (robotObj6 instanceof ModelT2000 robotT2000) {
            robotT2000.dance();
            robotT2000.action();
        }

        System.out.println("===8");
        Object robotObj7 = context.getBean("t2000v4");
        if (robotObj7 instanceof ModelT2000 robotT2000) {
            robotT2000.dance();
            robotT2000.action();
        }

        System.out.println("===9");
        ModelT2000 robotT2000 = context.getBean("modelT2000", ModelT2000.class);
        robotT2000.dance();
        robotT2000.action();

        System.out.println("===10");
        ModelT3000 robotT3000v1 = context.getBean(ModelT3000.class);
        robotT3000v1.dance();
        robotT3000v1.action();

        System.out.println("===11");
        ModelT3000 robotT3000v2 = context.getBean(ModelT3000.class);
        robotT3000v2.dance();
        robotT3000v2.action();

        System.out.println("===");
    }
}
