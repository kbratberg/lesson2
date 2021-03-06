package edu.wctc;

import java.io.Serializable;

public class Dog extends Animal implements Adoptable, Serializable {

    private boolean isFriendly;

    @Override
    public void speak()
    {
        System.out.println("Woof");
    }


    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    @Override
    public double getAdoptionFee() {
        return 75;
    }
}
