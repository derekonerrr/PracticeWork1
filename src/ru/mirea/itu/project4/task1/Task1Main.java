package ru.mirea.itu.project4.task1;

public class Task1Main {

    public static void printSeasonInfo(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }

    public static void main(String[] args) {

        Season current = Season.AUTUMN;
        System.out.println("Текущее время года: " + current);
        System.out.println("Средняя температура: " + current.getAvgTemperature());
        System.out.println("Описание: " + current.getDescription());
        System.out.println();

        printSeasonInfo(current);
        printSeasonInfo(Season.SUMMER);
        System.out.println();

        for (Season s : Season.values()) {
            System.out.println(s + ": средняя температура = " + s.getAvgTemperature()
                    + ", " + s.getDescription());
        }
    }
}
