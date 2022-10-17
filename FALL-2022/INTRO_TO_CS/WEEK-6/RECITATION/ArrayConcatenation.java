public class ArrayConcatenation {
    public static void main(String[] args)
    {
        int[] a = {2,5,7,3};
        int[] b = {8,7,1,7};
        int[] concatArr = new int[a.length + b.length];
        for(int i = 0; i < a.length; i++)
        {
            concatArr[i] = a[i];
        }
        for(int i = 0; i < b.length; i++)
        {
            concatArr[a.length + i] = b[i];
        }
        for(int i = 0; i < concatArr.length; i++)
        {
            System.out.print(concatArr[i] + ", ");
        }

    }
    
}
