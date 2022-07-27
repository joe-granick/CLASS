public class LuckySevens {
    public static void main(String[] args){
        String number = args[0];
        int len = number.length();
        int sevens = 0;

        for(int i = 0; i < len; i++){
            char digit = number.charAt(i);
            if(digit == '7') sevens++;
            System.out.println(digit+" "+ sevens);
        }
    }
    
}
