public class Chaos {
    public static void main(String[] args){
        double r = Double.parseDouble(args[0]);
        double x = 0.01;
        double EPSILON = 1e-5;
        int t = 0;

        while(Math.abs(x -(1 - 1/r)) > EPSILON && (x > 0.0) && (x < 1.0)){
            x *= (r*(1-x));
            t++;
            System.out.println("Pop: " + x + " time: " + t + " converges? " + (1-1/r));
        }

    }
    
}
