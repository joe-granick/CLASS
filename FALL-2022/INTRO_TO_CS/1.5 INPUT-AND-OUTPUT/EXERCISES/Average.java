public class Average {
    public static void main (String[] args)
    {
        double sum = 0.0;
        int count = 0;

        while(!StdIn.isEmpty())
        {
            double value = StdIn.readDouble();
            sum += value;
            count++;
        }
        double average = (sum/count);
        StdOut.print("Average is : " + average + " total is : " + sum + " count is : " + count );
    }
    
}
