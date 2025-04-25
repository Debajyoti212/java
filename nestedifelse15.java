import java.util.Scanner;

public class nestedifelse15 {
    public static void main(String[] args) {
       
                int a = 9;
                int b = 8;
                int c = 1;
        
                if (a > b) {
                    System.out.println("a is bigger than b");
                    if (a > c) {
                        System.out.println("a is bigger than c");
                        System.out.println("a is largest " + a);
                    } else {
                        System.out.println("c is bigger than a");
                        System.out.println("c is largest " + c);
                    }
                } else {
                    // code for b >= a can go here if needed
                }
            }
        }
        
    

