import java.util.Scanner;
import java.util.Arrays;

public class array24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number a");
        int a = sc.nextInt();
        System.out.println("enter the number b");
        int b = sc.nextInt();
        System.out.println("enter the number c");
        int c = sc.nextInt();
        int marks[] = { a, b, c };
        System.out.println(Arrays.toString(marks));

    }

}
