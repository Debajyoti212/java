import java.util.Scanner;

public class forloop18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number n");
        int n = sc.nextInt();
        System.out.println("so the number is " + n);
        System.out.println("the multiplication table is");
        for (int i = n; i <= n * 10; i += n) {
            System.out.println(+i);
        }
    }
}
