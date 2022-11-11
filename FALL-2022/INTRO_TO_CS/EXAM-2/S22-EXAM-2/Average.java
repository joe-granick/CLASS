public class Average
{
    public static void main(String[] args)
    {
        int sum = 0;
        int count = 0;
        while(!StdIn.isEmpty())
        {
            sum += StdIn.readInt();
            count++;
        }

        StdOut.print((double)sum/count);
        
    }
}