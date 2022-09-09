public class DescriptiveStats {
    public static void main (String[] args)
    {
        int n = Integer.parseInt(args[0]);
        double[] sample = new double[n];
        double sum = 0.0;
        double mean = 0.0;
        double stdDev = 0.0;
        for (int i = 0; i < n; i++)
        {
            sample[i] = StdIn.readInt();
            sum += sample[i];
        }
        mean = sum/n;
        for(int i = 0; i < n; i++)
        {
            stdDev += Math.pow(sample[i] - mean,2);
        }
        stdDev = Math.sqrt(stdDev)/(n-1);
        System.out.println("Mean: " + mean);
        System.out.println("Sample Deviation: " + stdDev);
    }
    
}
