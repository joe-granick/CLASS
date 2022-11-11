/* S21 Exam 2 Q1
 * meant to test tyoe conversions
 */

 public class Average{
    public static void main(String[] args)
    {
        int sum = 0;
        for(int i = 0; i < args.length; i++)
            sum+= Integer.parseInt(args[i]);
        
        double average = (double)sum/args.length;
        System.out.println(average);
            
        }
    }
 