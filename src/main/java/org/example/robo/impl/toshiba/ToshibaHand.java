package org.example.robo.impl.toshiba;

import org.example.robo.interfaces.Hand;
import org.springframework.stereotype.Component;

@Component
public class ToshibaHand implements Hand {
    @Override
    public void catchObject() {
        System.out.println("ToshibaHand catch");
    }

    @Override
    public String toString() {
        return "ToshibaHand{}"+ "@" + Integer.toHexString(hashCode());
    }
}
