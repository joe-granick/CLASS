public class Voting
{
    public static void main(String[] args)
    {
        int age = Integer.parseInt(args[0]);
        if (age >= 18) System.out.print(true);
        else           System.out.println(false);
    }
} 