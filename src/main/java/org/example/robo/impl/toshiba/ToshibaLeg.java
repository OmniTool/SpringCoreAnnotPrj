package org.example.robo.impl.toshiba;

import org.example.robo.interfaces.Leg;

public class ToshibaLeg implements Leg {
    @Override
    public void go() {
        System.out.println("ToshibaLeg go");
    }

    @Override
    public String toString() {
        return "ToshibaLeg{}"+ "@" + Integer.toHexString(hashCode());
    }
}
