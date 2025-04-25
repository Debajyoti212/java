import java.util.Scanner;

public class nestedifelse15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age of a ");
        int a = sc.nextInt();
        System.out.println("the age is " + a);

        System.out.println("enter the age of b ");
        int b = sc.nextInt();
        System.out.println("the age is " + b);

        System.out.println("enter the age of a ");
        int c = sc.nextInt();
        System.out.println("the age is " + c);
        if (a > b) {
            System.out.println("a is bigger than b");
            if (a > c) {
                System.out.println("a is bigger than c");
                System.out.println("a is the largest" + a);
            } else {
                System.out.println("c is greatest");
                System.out.println("c is largest" + c);
            }
        } else {
            System.out.println("b is bigger than a");
            if (b > c) {
                System.out.println("b is greater than c");
                System.out.println("b is largest" + c);
            } else {
                System.out.println("c is bigger than b");
                System.out.println("c is largest" + c);
            }
        }
    }
}
