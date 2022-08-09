public class GreatesCommonDivisor {
    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int n, d;
        int factor = 0;

        if (x > y) {
            n = x;
            d = y;
        }
        else{
            n = y;
            d = x;
        }

        for(int i = 2; i <= d; i++ ){
            if (d%i==0 && n%i==0) factor = i;
        }
            System.out.print(factor);
    }
    
}
