package ru.max.lsn262;

/**
 * @author Serov Maxim
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(determineRainfall(8, 12));
        System.out.println(determineRainfall( 0.11, 0.33));
    }
    public static long determineRainfall(double area, double rainfallAmount) {
        double squareMInDay = (area * 1_000_000) * 2;
        return (long) (squareMInDay * rainfallAmount);
    }
}
