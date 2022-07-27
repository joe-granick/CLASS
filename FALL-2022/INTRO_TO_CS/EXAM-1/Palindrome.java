public class Palindrome {
    public static void main(String[] args){

        int num = Integer.parseInt(args[0]);

        int first = num/100;
        int third = num%10;
        if(first == third) System.out.print("Palidnrome");
        else System.out.print("Not palindrome");
    }
    
}
