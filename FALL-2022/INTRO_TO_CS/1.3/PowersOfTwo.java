public class PowersOfTwo {
    public static void main(String[] args){
    int n = Integer.parseInt(args[0]);
    int i = 0;
    int power = 1;

    while(i < n){
        power = 2*power;
        i++;
    }
    System.out.print("2 raised to the power "+ n + " = " + power);

    }
}
