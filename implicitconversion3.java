public class implicitconversion3 {
    public static void main(String[] args) {
        int count = 12;
        long countlong = count;// long is a data type to store large integers
        System.out.println(countlong);
        // cant store long valus in int using int countint=count
        long counter = 13;
        int counterint = (int) counter;
        System.out.println(counterint);
        // convert from int to byte
        int age = 150;
        byte newage = (byte) age;
        System.out.println(newage);
    }
}
