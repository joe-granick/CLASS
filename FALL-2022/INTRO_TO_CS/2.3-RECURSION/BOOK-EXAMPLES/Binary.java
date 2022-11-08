public class Binary
{
    /*iterative solution prints binary in the wrong order
     * could be solved by prepending values to empyt string but ineffecient
     */
    public static void wrongBinary(int n)
    {

        while(n != 0)
        {
            System.out.print(n%2);
            n/=2;
        }
        System.out.println();
    }

    /*recursive solution works properly if organized correctly 
     * with recursive calll before print operation,
     * because of how recursion works, this prints in reverse order vs
     * it being placed before recursive step
     */
    public static void printBinary(int n)
    {
        if(n == 0)     return;
        printBinary(n/2);
        System.out.print(n%2);

    }
        public static void main(String[] args)
        {
            int n = Integer.parseInt(args[0]);
            wrongBinary(n);
            printBinary(n);

        }
    
}