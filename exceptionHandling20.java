public class exceptionHandling20 {
    static int a[] = new int[5];

    public static void main(String[] args) {
        System.out.println("hello guys");

        try {
            System.out.println(a[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("bye guys " + e);
        }
    }
}

    

