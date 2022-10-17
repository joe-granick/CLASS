public class ArrayDiff {
    public static void main(String[] args)
    {
        int n = args.length;
        int diffs[] = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
        {
            diffs[i] = Integer.parseInt(args[i]);
            if(diffs[i] < min) min = diffs[i];
            if(diffs[i] > max) max = diffs[i];
        }
        System.out.print(max - min);
    }
    
}
