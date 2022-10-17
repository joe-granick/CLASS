public class ArrayAverage
{
    public static void main(String[] args)
    {
        int [] arr = {1, 7, 6, 3,2};
        double sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println(sum/arr.length);
    }
}