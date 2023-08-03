package org.example.robo.impl.robo;

import org.example.robo.interfaces.Hand;
import org.example.robo.interfaces.Leg;
import org.example.robo.interfaces.Robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PropertySource("classpath:roboSerial.properties")
public class ModelT3000 implements Robot {

    private Hand hand;
    private Leg leg;
    private String color;
    @Value("0")
    private int version;
    @Value("${model.device:default_if_not_found}")
    private String serial;

    public ModelT3000(Hand hand, Leg leg) {
        this.hand = hand;
        this.leg = leg;
    }

    @Autowired
    public ModelT3000(@Qualifier("sonyHand_v1") Hand hand, @Qualifier("sonyLeg_v1") Leg leg,
                      @Value("red") String color) {
        this.hand = hand;
        this.leg = leg;
        this.color = color;
        System.out.println(version + color + " ModelT3000 created");
    }

    @Override
    public void action() {
        hand.catchObject();
        leg.go();
    }

    @Override
    public void dance() {
        System.out.println(this);
        System.out.println("T3000 is dancing!");
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

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return super.toString() +
                " ModelT3000{" +
                "hand=" + hand +
                ", leg=" + leg +
                ", color='" + color + '\'' +
                ", version=" + version +
                ", serial=" + serial +
                '}';
    }
}
