import java.util.Scanner;

public class method31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a " );
        int a = sc.nextInt();
        System.out.println(" the value of a " + a);
        System.out.println("enter the value of b ");
        int b = sc.nextInt();
        System.out.println(" the value of a " + b);
        average(a, b);
    }

    public static void average(int a, int b) {
        int avg = (a + b) / 2;
        System.out.println("the average is " + avg);
    }
}
