package laba2;
import java.util.Scanner;
import java.util.Random;


public class ex_5 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        int sum = 0;

        System.out.println("Введите количество слогаемых");
        int Size = id.nextInt();
        System.out.println("Количество слогаемых "+ Size);
        int[] nums = new int[Size];
        Random random = new Random();
        for (int i = 0 ; i < nums.length ; i++ ){
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива ["+i+"] = " + nums[i]);
            if ( nums[i]%5 == 2 && nums[i]%3 ==1){
            System.out.println(nums[i]);
            sum+= nums[i];

        }
    }System.out.println(sum);
}}