
import java.util.Scanner;

public class foreachloop26 {
    public static void main(String[] args) {
        String names[] = { "dev", "shyam", "karan" };
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name is " + names[i]);
        }
    for(String name:names){
        System.out.println("for each "+name);
    }
    }

}
