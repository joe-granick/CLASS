
public class DuplicateWords{
public static String dup(String s)
{
    return s+s;
}

public static void main (String[] args)
{
    String s = "Hello";
    s = dup(s);
    String t = "Bye";
    t = dup(dup(dup(t)));
    StdOut.print(s+t);

}

}