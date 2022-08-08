public class Binary {
    //pattern here is counting up then unraveling
    //first number will always be 1
    //for ones reduce bhyh the bit
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int bit = 1;
        int i = 0;
        String code = "";

        while(bit <= n/2){
            i++;
            bit*=2;
            System.out.println("value: "+ bit + " power: " + i);
        } 
        while (bit > 0){
            if (n<bit){     code+="0";}
            else      {code+="1";
                        n = (n - bit);}
            bit = bit/2; //since it's an int 1/2 rounds to 0
                       }       
                       System.out.println(code);
    }        
}
    
