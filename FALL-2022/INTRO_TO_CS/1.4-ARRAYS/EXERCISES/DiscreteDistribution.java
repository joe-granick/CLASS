public class DiscreteDistribution {
    public static void main(String[] args)
    {
    int n = args.length;
    int[] freq = new int[n];
    int total = 0;
    for(int i = 0; i < n; i++)
        {
            freq[i] = Integer.parseInt(args[i]);
            total+= freq[i];
        }
    
    int r = (int)(Math.random()*total);
    int event;
    int sumTotal = 0;
    for(int i = 0; i < n && sumTotal < r; i ++)
    {   
        sumTotal += freq[i];
        event = i;
        System.out.println("i: " + event + " count: " + freq[i] + " proportional prob: " + sumTotal + " random int r: " + r + " total prob: " + total);
    }
    }

}