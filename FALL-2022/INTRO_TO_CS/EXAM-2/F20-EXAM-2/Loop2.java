public class Loop2
 {
    public static void main (String[] args)
    {
    int n = Integer.parseInt(args[0]);
    int i = 1;
    int j = 0;
    while ( i < n ) {
        for (j = 0; j < n; j++ ) {
            if ( j % i == 0 )
            System.out.print(j + " ");
            else
            System.out.print(0 + " ");
            }
        System.out.println();
        i++;
        }
    System.out.println("There are " + i + " rows and " + j + " columns");
    System.out.println(Math.ceil(2));
    System.out.println(Math.min(2, 5)); 
    System.out.println(Math.min(2, 5.0));
    System.out.println(Math.pow(5/2, 2)); 
    System.out.println(Math.pow(5.0/2, 2)); 
    }
}