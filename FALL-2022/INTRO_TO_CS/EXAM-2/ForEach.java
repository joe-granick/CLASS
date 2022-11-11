public class ForEach {

    public static void oneDimensionalArray(int[] arr)
    {
        for(int var : arr)
        {
            System.out.println(var);
        }
    }

    public static void twoDimensionalArray(int[][] arr)

    {
        for(int[] var: arr){
            for(int subVar: var)
            {
                System.out.print(subVar + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int[] oneD = {0, 1, 2};
        int[][] twoD = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}} ;

        oneDimensionalArray(oneD);
        twoDimensionalArray(twoD);

    }
    
}
