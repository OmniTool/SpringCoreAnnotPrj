package org.example.robo.impl.robo;

import org.example.robo.impl.sony.SonyHand;
import org.example.robo.impl.sony.SonyLeg;
import org.example.robo.interfaces.Robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ModelT1000 implements Robot {

    @Autowired
    private SonyHand hand;
    @Autowired
    private SonyLeg leg;

    public ModelT1000() {
    }

    public ModelT1000(SonyHand hand, SonyLeg leg) {
        this.hand = hand;
        this.leg = leg;
    }


    @Override
    public void action() {
        hand.catchObject();
        leg.go();
    }

    @Override
    public void dance() {
        System.out.println(this);
        System.out.println("T1000 is dancing!");
    }

    @Override
    public String toString() {
        return super.toString() +
                " ModelT1000{" +
                "hand=" + hand +
                ", leg=" + leg +
                '}';
    }
}
