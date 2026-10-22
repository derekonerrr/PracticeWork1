package ru.mirea.itu.project1;

public class Main {

    public static void main(String[] args) {

        // Массив инициализируется сразу при объявлении (как в Си: int arr[] = {...};)
        int[] arr = {12, 7, 25, 3, 18, 9, 30};

        int sum = 0;

        // Цикл for для подсчета суммы элементов массива
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = (double) sum / arr.length;

        // Вывод массива на экран
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Сумма элементов массива = " + sum);
        System.out.println("Среднее арифметическое элементов массива = " + average);
    }
}