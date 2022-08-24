public class InversePermutation {
    public static void main(String[] args)
    {
        int n = args.length;
        int[] a = new int[n];
        int[] b = new int[n];
        boolean[] check = new boolean[n];
        
        for(int i = 0; i < n; i++)
        {
            a[i] = Integer.parseInt(args[i]);
            if(a[i] >= n || a[i] < 0)
            {
                System.out.println("Not a permuation");
                break;
            }
            b[a[i]] = i;
            check[a[i]] = true;
        }
        for(int i = 0; i < n; i++)
        {
            if(!check[i]){
                System.out.println("Not a permutation");
                break;
            }
        }
        for(int i = 0; i < n; i++) System.out.print(a[i] + " ");
        System.out.println();
        for(int i = 0; i < n; i++) System.out.print(b[i] + " ");

    }
}
