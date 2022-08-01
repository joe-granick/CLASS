public class PowerTwoLessThan {
    public static void main(String[] args){

        int n = Integer.parseInt(args[0]);
        int result = 1;
        while(result <= n/2){
            result = 2*result;
        }
        System.out.println(result);
    }    
}
