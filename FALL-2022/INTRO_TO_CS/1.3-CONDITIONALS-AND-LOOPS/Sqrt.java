public class Sqrt {
    public static void main(String[] args){
        double num = Double.parseDouble(args[0]);
        double guess = num;
        double EPSILON = 1e-15;

        while(Math.abs((guess*guess)-num)  > EPSILON){

            guess = (num/guess + guess)/2.0;

        }
        System.out.println(guess);
    }
}
