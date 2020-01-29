package edu.wctc;

public class Cat extends Animal implements Adoptable {

    private int mousesKilled;
    private static int catCount = 0;
    private int catID;

    public Cat()
    {
        catCount++;
        catID = catCount;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catID=" + catID + "name" + getName() +
                '}';
    }



    public void speak()
    {
        System.out.println("Meow");
    }

    public int getMousesKilled() {
        return mousesKilled;
    }

    public void setMousesKilled(int mousesKilled) {
        this.mousesKilled = mousesKilled;
    }

    @Override
    public double getAdoptionFee() {
        return 50;
    }
}
