public class Histogram
{
    public static int[] histogram(int[] a, int m)
    {
        int[] hist = new int[m];
        for(int i = 0; i < a.length; i++)
        {
            hist[a[i]]++;
        }
        return hist;
    }
    public static void main(String[] args)
    {
        int[] a = {1, 1, 2, 2, 3, 4, 5, 5, 5, 5, 5, 5, 6 ,7, 5, 5};
        int m = 8;
        int[] hist = histogram(a, m);
        for(int i = 0; i < m; i++)
        {
            StdOut.print(hist[i]);
        }


    }

}