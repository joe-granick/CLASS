public class InplaceReverse {
    public static void main(String[] args)
    {
        int n = args.length;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(args[i]);
        }
        for(int i = 0; i < n/2; i++)
        {
            int t = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = t;
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + ", ");
        }
    }
    
}
