public class LoopPrint {
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        for(int i = 1; i <= n; i++ ) System.out.println("for loop: " + i);
        int i = 1;
        while(i <= n)
        {
            System.out.println("while loop: " + i);
            i++;
        }

    }
    
}
