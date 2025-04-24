import java.util.Scanner;
public class ifelse13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age");
        int age=sc.nextInt();
        System.out.println("the age is"+age);
        if(age>=18){
            System.out.println("u can vote");
        }else{
            System.out.println("u cant");
        }

        
    }
}
