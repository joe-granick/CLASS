public class dupArray{
    public static void main(String[] args)
    {
        int n = args.length;
        int[] dups = new int[n];
        for(int i = 0; i < n; i++) dups[i] = Integer.parseInt(args[i]);
        boolean duplicate = false;

        for(int i = 0; i < n-1; i++){
            for (int j = i+1; j < n; j++)
            {
                if (dups[j] == dups[i])
                {
                    duplicate = true;
                    break;
                }
            }
        }

        System.out.print(duplicate);

    }
}