public class paal {

    public static boolean isPalindrome(String str) {
        // !!a single character or an empty string is a palindrome!!
        if (str.length() <= 1) {
            return true;
        }

        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);
        if (first == last) {
            String middle = str.substring(1, str.length() - 1);
            return isPalindrome(middle);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // test Palindrome method
        String str1 = "Nascar";
        String str2 = "Municipal";
        System.out.println(str1 + " is palindrome: " + isPalindrome(str1));
        System.out.println(str2 + " is palindrome: " + isPalindrome(str2));
    }
}

