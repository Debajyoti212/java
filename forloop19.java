import java.util.Scanner;

public class forloop19 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  total natural number n");
        int n = sc.nextInt();
        System.out.println("so the number is " + n);
        System.out.println("the sum of n natural number is");
        int sum=0;
        for (int  i = 1; i <= n ; i ++) {
          sum=sum+i;
          
        }
        System.out.println(+sum);
    }
}
