package laba2;

import java.util.Scanner;

public class ex_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input length");
        int number = in.nextInt();
        int massiv[] = new int[number];
        for (int i=0; i<number; i++){
            for (int n: massiv){
            massiv[i] = i*5+2;}


        }for (int i: massiv){

            System.out.print(i+" ");

        }


    }
}
