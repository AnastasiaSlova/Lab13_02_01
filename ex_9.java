package laba2;

import java.util.Random;
import java.util.Scanner;

public class ex_9 {
    public static void main(String[] args) {
        int[] massiv;
        massiv = new int[12];

        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = ((int)(Math.random() * 12));
            System.out.println(massiv[i]);}

        int min = massiv[0];

        for(int x: massiv) {
            if(x < min) min = x;
        }
        System.out.println("Minimal element: " + min);
    }
}


