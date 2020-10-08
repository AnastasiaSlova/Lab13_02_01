
package laba2;
import java.util.Scanner;
public class ex_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Input number a: ");
        int a = in.nextInt();
        System.out.println("input number b: ");
        int b = in.nextInt();
        int c, d =0;
        c = a-b;
        d = b-a;

        int i = 0;

//        System.out.println("Delta" + c);
        if (a>=b) {

            System.out.println(b);
            for (i = c; i<=a; i++)
            { b++;

                System.out.println(b);}
        }
         if (a<b) {
             System.out.println(a);
             for (i = d; i<=b; i++)
             {a++;
                System.out.println(a);


    }
    }
}}
