public class Kary {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        int bit = 1;
        int i = 0;


        while(bit <= n/k){
            i++;
            bit*=k;
            System.out.println("value: "+ bit + " power: " + i);
        }

        String code = "";
        int multiple = k-1; 
        while (bit > 0){
                while (n < multiple*bit){
                    multiple--;
                    }

            code += multiple;    
            n = n-multiple*bit;
            bit = bit/k;
            multiple = k-1; //since it's an int 1/2 rounds to 0
                       }       
                       System.out.println(code);
    }        
}
    
