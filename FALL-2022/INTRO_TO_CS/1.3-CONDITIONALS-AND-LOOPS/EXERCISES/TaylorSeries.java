public class TaylorSeries {
    public static void main(String[] args){
        double x = Integer.parseInt(args[0]);
        double sum = 0.0;
        double term = 1.0;
        for (int i = 1; sum != (sum + term); i++){
            sum = sum + term;
            term = term * (x/i);
            System.out.println(term);
        } 
        
        System.out.println("e raised to the " + x + " is: " + sum); 
    }
}
