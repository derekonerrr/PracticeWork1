package ru.mirea.itu.project4;

public class Main {
    public static void main(String[] args) {
        Level level;
        level = Level.MEDIUM;
        Level level1;
        level1 = Level.LOW;
        level = level1;
        if (level1 == level) System.out.println("равны");
        else System.out.println("не равны");
        for (Level l : Level.values()) System.out.println(l);
    }
}
