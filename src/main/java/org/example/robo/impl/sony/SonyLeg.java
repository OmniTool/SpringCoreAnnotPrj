package org.example.robo.impl.sony;

import org.example.robo.interfaces.Leg;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sonyLeg_v1")
@Scope("prototype")
public class SonyLeg implements Leg {
    @Override
    public void go() {
        System.out.println("SonyLeg go");
    }

    @Override
    public String toString() {
        return "SonyLeg{}"+ "@" + Integer.toHexString(hashCode());
    }
}
