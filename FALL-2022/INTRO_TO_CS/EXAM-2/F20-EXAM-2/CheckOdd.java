public class CheckOdd {
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i<n; i++)
        {
            System.out.println(i+"%2: " + (i%2));
        }
    }
    
}
