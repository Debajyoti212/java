import java.util.Scanner;

public class switch16 {
    public static void main(String[] args) {
        System.out.println("enter the day ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        System.out.println("the day is " + day);
        switch (day) {
            case 1:
                System.out.println("today is Sunday");
                break;
            case 2:
                System.out.println("today is monday");
                break;
            case 3:
                System.out.println("today is tuesday");
                break;
            case 4:
                System.out.println("today is wednesday");
                break;
            case 5:
                System.out.println("today is thursday");
                break;
            case 6:
                System.out.println("today is friday");
                break;
            case 7:
                System.out.println("today is saturday");
                break;
        }
    }
}
