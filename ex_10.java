package laba2;
import java.util.Arrays;
import java.util.Random;
public class ex_10 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Random random = new Random();
        for (int i = 0 ; i < nums.length ; i++ ){
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива ["+i+"] = " + nums[i]);
        }
        Arrays.sort(nums);
        for (int i = 0 ; i < nums.length ; i++ ){
            System.out.println("Элемент массива ["+i+"] после сортировки = " + nums[i]);

        }
        for (int i = nums.length-1 ; i >=0 ; i-- )
        System.out.println(nums[i]);
    }
}
