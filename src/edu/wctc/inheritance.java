package edu.wctc;
import java.io.*;
import java.util.ArrayList;

public class inheritance {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
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
        waffles.setMousesKilled(10);
        System.out.println(cat);
        System.out.println(charlie);
        System.out.println(waffles);

        FileOutputStream fos = new FileOutputStream("cats.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(cat);
        oos.writeObject(charlie);
        oos.writeObject(waffles);

        oos.close();

        ArrayList<Cat> cats = new ArrayList<>();

        FileInputStream fis = new FileInputStream("cats.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object obj;

        try {
        while ((obj = ois.readObject()) != null)
        {
            Cat aCat = (Cat)obj;
            cats.add(aCat);
        }}catch (EOFException e){
            //do nothing, we expect to reach the end of the file
        }


        for (Cat aCat : cats)
        {
            System.out.println(aCat); // does same thing
        }


    }
}
