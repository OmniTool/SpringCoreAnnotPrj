package org.example.robo.impl.robo;

import org.example.robo.interfaces.Hand;
import org.example.robo.interfaces.Leg;
import org.example.robo.interfaces.Robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ModelT2000 implements Robot {

    private Hand hand;
    private Leg leg;
    private String color;

    public ModelT2000() {
    }

    @Autowired
    public ModelT2000(Hand hand, Leg leg) {
        this.hand = hand;
        this.leg = leg;
    }

    public ModelT2000(Hand hand, Leg leg, String color) {
        this.hand = hand;
        this.leg = leg;
        this.color = color;
    }

    @Override
    public void action() {
        hand.catchObject();
        leg.go();
    }

    @Override
    public void dance() {
        System.out.println(this);
        System.out.println("T2000 is dancing!");
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() +
                " ModelT2000{" +
                "hand=" + hand +
                ", leg=" + leg +
                ", color='" + color + '\'' +
                '}';
    }

    private void init() {
        System.out.println("INIT ModelT2000");
    }

    private void destroy() {
        System.out.println("DESTROY ModelT2000");
    }
}
