package ru.geekbrains.lesson1;

public class Cat {
    String name;
    String color;
    int age;

    public Cat (String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public static void main (String [] args) {
        Cat cat1 = new Cat("barsik", "red", 7);
        Cat cat2 = new Cat("Vasya", "black", 5);

        System.out.println("Cat 1: " + cat1.name + " " + cat1.color + " " + cat1.age);
        System.out.println("Cat 2: " + cat2.name + " " + cat2.color + " " + cat2.age);

    }
}
