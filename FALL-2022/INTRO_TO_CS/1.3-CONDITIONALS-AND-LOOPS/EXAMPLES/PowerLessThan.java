public class PowerLessThan {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int result = 1;
        int power = 0;
        while(result < n){
            result = 2*result;
            power++;
            System.out.println("Sum: " + result + " Power:" + power);

        }

        System.out.println(result);

    }
    
}
