public class exceptionhandling21 {
    public static void main(String[]args){
        int a[] = new int[5];
        System.out.println("hello guys");

        try {
            int result=5/0;
            System.out.println(a[8]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("handling the exceptions");
        } 
    }
    
}
