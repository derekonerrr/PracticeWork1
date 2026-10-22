package ru.mirea.itu.project3;

public class MovableTest {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5, 6, 10, 15);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Movable m2 = new MovableCircle(1, 2, 3, 4, 20);
        System.out.println(m2);
        m2.moveRight();
        m2.moveUp();
        System.out.println(m2);

        MovableRectangle m3 = new MovableRectangle(0, 10, 10, 0, 2, 3);
        System.out.println(m3);
        System.out.println("Одинаковая скорость точек: " + m3.hasSameSpeed());
        m3.moveUp();
        m3.moveRight();
        System.out.println(m3);
        m3.moveDown();
        m3.moveLeft();
        System.out.println(m3);
    }
}
