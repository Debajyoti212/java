import java.util.Scanner;
public class usrinput12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age");
        int age=sc.nextInt();
        System.out.println("age is"+age);
        System.out.println("enter the number a");
        int a=sc.nextInt();
        System.out.println("enter the number b");
        int b=sc.nextInt();
        int result=a+b;
        System.out.println("the result is"+result);
    }
}
