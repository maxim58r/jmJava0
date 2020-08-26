package ru.max.lsn255;

/**
 * @author Serov Maxim
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(determineAdult(-5));
        System.out.println(determineAdult(2));
        System.out.println(determineAdult(23));
    }

    public static boolean determineAdult(int age) {
        if (age < 0)
            System.out.println("Ошибка! Введите правильный возраст.");
        return age >= 18;

    }
}
