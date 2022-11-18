public class Palindrome {

    public static boolean isPalindrome(String s)
    {
        if (s.length() <= 1) return true;
        if(s.charAt(0) != s.charAt(s.length()-1)) return false;

        return isPalindrome(s.substring(1, s.length()));
    }
    
    public static void main(String[] args)
    {
        StdOut.println(isPalindrome("bob"));
        StdOut.println(isPalindrome("steve"));
        StdOut.println(isPalindrome("racecar"));
    }

}
