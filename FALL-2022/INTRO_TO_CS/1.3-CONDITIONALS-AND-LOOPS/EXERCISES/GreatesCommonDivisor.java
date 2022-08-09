public class GreatesCommonDivisor {
    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int n, d;
        int factor = 1;

        if (x > y) {
            n = x;
            d = y;
        }
        else{
            n = y;
            d = x;
        }

        for(int i = d; i > 0; i-- ){
            if (d%i==0 && n%i==0){ 
                factor = i;
                break;}
        }
            System.out.print(factor);
    }
    
}
