package laba2;

import java.util.Scanner;

public class ex_2 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input day of the week:");
        String day = in.nextLine();
        switch(day){
            case"monday":
                System.out.println("1");
                break;
            case"tuesday":
                System.out.println("2");
                break;
            case"wednesday":
                System.out.println("3");
                break;
            case"thursday":
                System.out.println("4");
                break;
            case"friday":
                System.out.println("5");
                break;
            case"saturday":
                System.out.println("6");
                break;
            case"sunday":
                System.out.println("7");
                break;
            default:
                System.out.println("Doesn't exist");



        }
}}
