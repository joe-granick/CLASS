public class TaylorSeries {
    public static void main(String[] args){
        double x = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        double factorial = 1.0;
        double e = 1.0;
        double xRaised = x;
        double nFactorial = 1.0;
        for (int i = 0; i <= n; i++){
            e = e + (xRaised)/(nFactorial);
            System.out.println(xRaised + " " + nFactorial + " " + e);
            xRaised = xRaised*x;
            factorial = factorial + 1.0;
            nFactorial = (nFactorial*factorial);
            
            
            
        } 
        
        System.out.println("e raised to the " + x + " is: " + e); 
    }
}
