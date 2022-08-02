public class UniformRandomSum {
    public static void main(String[] args){
        //takes argument n, and gnerates n random values between 0-1 adn prints their average
        int n = Integer.parseInt(args[0]); // takes integer input from command lin
        double sum = 0.0;  //accumulation variable
        double avg = 0.0;// variable to store result
        int i = 0;
        while (i < n){
            i++;
            sum += Math.random();
            System.out.println("count: " + i);
            System.out.println("sum: " + sum);
        }
            avg = (sum/i);
            System.out.print("mean: " + avg);
    }
    
}
