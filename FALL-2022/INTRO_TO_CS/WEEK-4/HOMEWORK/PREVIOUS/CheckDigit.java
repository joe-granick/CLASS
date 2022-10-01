/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author:
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
        for(int i = 0; i < 13; i++){
            if(i%2 == 0) sum1 += digit%10; //isolate rightmost digit evens
            else         sum2 += digit%10; //isolate rightmost digit odds
                         digit = digit/10; //remove rightmost digit     
            //System.out.println("Sum 1: " + sum1 + " Sum 2: " +sum2);
        }
        sum1 = sum1%10; //isolate rightmost digit of evens sum
        //isolate rightmost digit of odds sum multiply by 3
        sum2 = ((sum2%10)*3)%10; 
        
        int sum3 = sum1 + sum2; //sum check digits of both sums
        int checkDigit =sum3%10; //isolate rightmost check digit
        //System.out.println("Digit 1: " + sum1 + " Digit 2: " + sum2 + " Check Digit: " + checkDigit);
        System.out.println(checkDigit);

    }
}