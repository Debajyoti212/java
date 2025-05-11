
import java.util.Scanner;

public class foreachloop27 {
    public static void main(String[] args) {
       int nums[] = { 12, 11, 10 };
       int sum=0;
        for (int number:nums) {
            sum +=number;
            
        }
        System.out.println("sum " + sum);
    }

}