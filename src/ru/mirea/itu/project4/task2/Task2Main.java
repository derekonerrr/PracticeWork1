package ru.mirea.itu.project4.task2;

public class Task2Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.M, 1500, "белый"),
                new Pants(Size.L, 3500, "синий"),
                new Skirt(Size.S, 2800, "красный"),
                new Tie(Size.XXS, 900, "черный")
        };

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothes);
        System.out.println();
        atelier.dressMan(clothes);
    }
}
