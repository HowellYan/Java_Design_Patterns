package org.example.creationalDesign.prototype;

public class Sheep implements Cloneable {
    private String name;

    private Integer age;

    private String color;

    private String type;

    private Sheep sheep;

    public Sheep(String name, Integer age, String color, String type, Sheep sheep) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.type = type;
        this.sheep = sheep;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", sheep=" + sheep +
                '}';
    }

    public Sheep getSheep() {
        return sheep;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return sheep;
    }
}
