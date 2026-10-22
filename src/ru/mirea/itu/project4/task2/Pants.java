package ru.mirea.itu.project4.task2;

public class Pants extends Clothes implements MenClothing, WomenClothing {

    public Pants(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские " + info("штаны"));
    }

    @Override
    public void dressWomen() {
        System.out.println("Женские " + info("штаны"));
    }
}
