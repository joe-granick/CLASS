public class ReverseString{ 
	public static String reverse(String s) { 
		String reverse = ""; 
		for(int i = s.length()-1; i >= 0; i--) 
			reverse = reverse + s.charAt(i); 
		return reverse;
	
	}

	public static String recursiveReverse(String s, String rev)
	{
		if(s.length() == 0) return rev;

		return recursiveReverse(s.substring(0, s.length()-1), (rev + s.charAt(s.length()-1)));
		
	}

	public static void main(String[] args)
	{
		String s = "fool";
		StdOut.println(reverse(s));
		StdOut.println(recursiveReverse(s, ""));



	}


}
