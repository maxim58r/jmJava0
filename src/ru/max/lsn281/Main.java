package ru.max.lsn281;

/**
 * @author Serov Maxim
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(getMinFromFour(5, 3, 6 ,7));
    }

    public static int getMinFromTwo(int x, int y) {
        return Math.min(x, y);
    }

    public static int getMinFromFour(int x, int y, int m, int n) {
       return getMinFromTwo(getMinFromTwo(x, y), getMinFromTwo(m, n));

    }
}
