public class Tribonacci{


    public static int fill(int[] arr, int index)
    {
        if(index == 0) return 0;
        if(index == 1) return 1;
        if (index == 2) return 1;

        arr[index] = fill(arr, index-1) + fill(arr, index-2) + fill(arr,index-3);
        return arr[index];

    }

    public static void main(String[] args)
    {
     int[] arr = new int[20];
     StdOut.print(fill(arr, 5));   
     
    }
}