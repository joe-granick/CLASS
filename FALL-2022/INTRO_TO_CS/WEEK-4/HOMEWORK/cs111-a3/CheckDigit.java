/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author: NET ID: jgranick EMAIL: jgranick@scarletmail.rutgers.edu
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {

        // WRITE YOUR CODE HERE
        long digit = Long.parseLong(args[0]);
        int sum1 = 0;
        int sum2 = 0;
        int i = 0;
        while(digit > 0)
        {
            sum1 += (digit%10);
    
            digit /= 10;
            sum2 += (digit%10);
            digit/=10;
        }
            int checkDigit1 = (sum1%10); 
            int checkDigit2 = (sum2%10);
            checkDigit2 *= 3;
            checkDigit2 %= 10;
            int checkDigit = checkDigit1 + checkDigit2;
            checkDigit %= 10;
            System.out.print(checkDigit);
    }
}