import java.util.Scanner;
import java.util.Arrays;

public class multidimnarray28 {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a ");
        a = sc.nextInt();
        System.out.println("the value of a is " + a);
        System.out.println("enter the value of b ");
        b = sc.nextInt();
        System.out.println("the value of a is " + b);
        int marks[][] = new int[a][b];
        int A;
        System.out.println("enter the value of A ");
        A = sc.nextInt();
        System.out.println("the value of a is " + A);
        marks[0][0] = A;
        int B;
        System.out.println("enter the value of B ");
        B = sc.nextInt();
        System.out.println("the value of a is " + B);
        marks[0][1] = B;
        int C;
        System.out.println("enter the value of C ");
        C = sc.nextInt();
        System.out.println("the value of a is " + C);
        marks[0][2] = C;
        int D;
        System.out.println("enter the value of D ");
        D = sc.nextInt();
        System.out.println("the value of a is " + D);
        marks[1][0] = D;
        int E;
        System.out.println("enter the value of E ");
        E = sc.nextInt();
        System.out.println("the value of a is " + E);
        marks[1][1] = E;
        int F;
        System.out.println("enter the value of F ");
        F = sc.nextInt();
        System.out.println("the value of a is " + F);
        marks[1][2] = F;
        System.out.println(Arrays.deepToString(marks));

    }

}
