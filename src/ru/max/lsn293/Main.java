package ru.max.lsn293;

import java.util.Arrays;

/**
 * @author Serov Maxim
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fillArray(3)));
    }
    static int[] fillArray(int x) {
        int[] l = new int[x];
        for (int i = 0; i < l.length; i++) {
            l[i] = i;
        }
        return l;
    }
}
