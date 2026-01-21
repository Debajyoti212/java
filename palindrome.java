public class palindrome {

    
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        String s = Integer.toString(x);
        String rev = new StringBuilder(s).reverse().toString();

        return s.equals(rev);
    }

  
    public static void main(String[] args) {
        int x1 = 121;
        int x2 = -121;
        int x3 = 10;

        System.out.println(isPalindrome(x1));
        System.out.println(isPalindrome(x2)); 
        System.out.println(isPalindrome(x3)); 
    }
}
