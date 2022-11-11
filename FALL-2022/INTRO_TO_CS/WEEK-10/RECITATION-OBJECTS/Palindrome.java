public class Palindrome
{
	public static boolean palindrome1(String s)
	{
    int n = s.length();
	for(int i = 0; i < n/2; i++){
        if(s.charAt(i) != s.charAt(n-1-i))
        {
			return false;
		}
    }
	return true;
			
	}


    public static boolean palindrome2(String s)
	{
    int n = s.length();
	for(int i = 0; i < n/2; i++){
        //s = s.toLowerCase();
        char firstChar = s.toLowerCase().charAt(i);
        char lastChar =  s.toLowerCase().charAt(n-i-1);
        if(firstChar != lastChar) return false;
    }
	    return true;
			
	}


    public static boolean palindrome3(String s)
	{
    int n = s.length();
	for(int i = 0; i < n/2; i++)
        {
        s = s.replaceAll(" ", "");
        s = s.toLowerCase();
        char firstChar = s.charAt(i);
        char lastChar =  s.charAt(n-i-1);
        if(firstChar != lastChar) return false;
        }
	    return true;
			
	}


    public static void main(String args[])
    {
        String s1 = "bob";
        String s2 = "Bob";
        String s3 = "nolemon no melon";

        System.out.println(palindrome1(s1));
        System.out.println(palindrome2(s2));
        System.out.println(palindrome3(s3));

    }
}