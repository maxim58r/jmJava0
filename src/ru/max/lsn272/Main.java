package ru.max.lsn272;

import java.util.Scanner;

/**
 * @author Serov Maxim
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = sc.nextLine();
        System.out.println("Здравствуйте, " + name + "!");
    }
}
