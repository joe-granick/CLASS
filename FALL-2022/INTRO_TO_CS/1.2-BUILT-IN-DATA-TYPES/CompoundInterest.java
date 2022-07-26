public class CompoundInterest {
    public static void main(String[] args){
        System.out.println("Enter Principle Interest Rate and Years invested");
        double P = Double.parseDouble(args[0]);
        double r = (Double.parseDouble(args[1]));
        double t = Double.parseDouble(args[2]);
        double money = P*Math.pow(Math.E, (r*t));
        System.out.print("after " + t + " years " +"at " + (r*100.0) + "% interest " + "$"+P +" will " + "grow to $" +money);
    }
    
}

