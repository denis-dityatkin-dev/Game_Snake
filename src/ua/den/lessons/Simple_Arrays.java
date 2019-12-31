package ua.den.lessons;

import java.util.Arrays;

public class Simple_Arrays {
    public static void main(String[] args) {
        int [] a = {1, 2, 3};
        int [] b = {7, 8, 9};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        b = a;
        b[2] = 20;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}
