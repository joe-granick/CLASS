public class TestProgram{
    public static int arrayMax(int[] arr)
    {
        /*if(arr.length == 0) 
        {
            return;
        }*/
        
        int max = arr[0];
        for(int i = 1; i < arr.length; i++)
            if(arr[i] > max) max = arr[i];
        
        return max;

    }

    public static void main (String[] args)
    {
        int[] iArray = {2, 4, 20, -3, 7};
        System.out.println("Max: " + arrayMax(iArray));
    }
}