package edu.wctc;

import com.sun.security.jgss.GSSUtil;

public class inheritance {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal dog = new Dog();
        Animal fish = new Fish();

        cat.setMousesKilled(5);
        cat.setName("Fuzz");
        Cat charlie = new Cat();
        charlie.setName("Charlie");
        charlie.setMousesKilled(1);
        Cat waffles = new Cat();
        waffles.setName("Waffles");
        System.out.println(cat);
        System.out.println(charlie);
        System.out.println(waffles);
    }
}
