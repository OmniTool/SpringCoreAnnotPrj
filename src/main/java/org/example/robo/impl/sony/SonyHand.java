package org.example.robo.impl.sony;

import org.example.robo.interfaces.Hand;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SonyHand implements Hand {
    @Override
    public void catchObject() {
        System.out.println("SonyHand catch");
    }

    @Override
    public String toString() {
        return "SonyHand{}"+ "@" + Integer.toHexString(hashCode());
    }
}
