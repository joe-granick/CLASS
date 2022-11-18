public class Palindrome {

    public static boolean isPalindrome(String s)
    {
        if (s.length() <= 1) return true;
        if(s.charAt(0) != s.charAt(s.length()-1)) return false;

        return isPalindrome(s.substring(1, s.length()-1));
    }
    
    public static void main(String[] args)
    {
        String s = "bob";
        StdOut.println(isPalindrome("b"));
        StdOut.println(s + "  length " + s.length());
        StdOut.println("bob charAt(length()-1) " + s.charAt(s.length()-1));
        String r = "racecar";
        StdOut.println("racecar substring(1, r.length()) " + r.substring(1,r.length()-1));
        StdOut.println(isPalindrome("bob"));
        StdOut.println(isPalindrome("steve"));
        StdOut.println(isPalindrome("racecar"));
    }

}
