package org.example.prototype;

public class SheepTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("1",1, "1", "1", new Sheep("1",1, "1", "1", null));

        Sheep cloneSheep1 = (Sheep) sheep.clone();
        Sheep cloneSheep2 = (Sheep) sheep.clone();

        System.out.println(sheep + ", " + sheep.hashCode());
        System.out.println(cloneSheep1 + ", " + cloneSheep1.getSheep().hashCode());
        System.out.println(cloneSheep2 + ", " + cloneSheep2.getSheep().hashCode());

    }
}
