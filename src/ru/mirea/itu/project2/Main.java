package ru.mirea.itu.project2;

public class Main {
    public static void main(String[] args) {
        Avtor Avtor1 = new Avtor("Артур", "artur@gmail.com", 'M');
        System.out.println(Avtor1);

        Avtor Avtor2 = new Avtor("Рома", "roma@gmail.com", 'М');
        System.out.println(Avtor2);

        Avtor2.setEmail("ROMAN222@gmail.com");
        System.out.println(Avtor2);

        System.out.println("Пол Avtor1: " + Avtor1.getGender());
        System.out.println("Имя Avtor2: " + Avtor2.getName());
    }
}