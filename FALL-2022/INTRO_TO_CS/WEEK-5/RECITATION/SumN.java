public class SumN {
    public static void main(String[] args)
    {
        int x = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 1; i <= x; i++)
        {
            sum += i;
        }
        System.out.println("for loop sum: " + sum);

        sum = 0;
        int i = 1;
        while (i <= x)
        {
            sum += i;
            i++;
        }
        System.out.println("while loop sum: " + sum);

        sum = 0;
        i = 0;
        do{
            sum += i;
            i++;
        }while (i <=x);
        System.out.println("do while loop sum: " + sum);
        
    }
    
}
