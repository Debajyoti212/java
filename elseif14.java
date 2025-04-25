import java.util.Scanner;
public class elseif14 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in); 
      System.out.println("enter the day");
      int day=sc.nextInt() ;
      System.out.println("the day is "+day);
      if(day==1){
        System.out.println("go to home");
      }else if(day==2){
        System.out.println("go to village");
      }else if(day==3){
System.out.println("go to city");
      }else{
        System.out.println("go to office");
      }
    }
}
