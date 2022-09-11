public class LongestRun {
    public static void main(String[] args)
    {
        int currentBest = 0;
        int prevN = Integer.MIN_VALUE;
        int count = 1;
        int n;
        int currentNum = 0;
        while(!StdIn.isEmpty())
        {
            n = StdIn.readInt();
            if(n == prevN) {
                count++;
            }
            else         count = 1;
            if(count > currentBest)
            {
                currentNum = n;
                currentBest = count;
            }
            prevN = n;
        }
        System.out.println(currentBest + " consecutive " + currentNum + "s");
    }
    
}
