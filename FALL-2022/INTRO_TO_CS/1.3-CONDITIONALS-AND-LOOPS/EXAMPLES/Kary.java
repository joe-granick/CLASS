public class Kary {
    public static void main(String[] args){
        long n = Long.parseLong(args[0]);
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
            switch(multiple)
            {
                case 15: code += "F"; break;
                case 14: code += "E"; break;
                case 13: code += "D"; break;
                case 12: code += "C"; break;
                case 11: code += "B"; break;
                case 10: code += "A"; break;
                default: code += multiple;
                
            }
               
            n = n-multiple*bit;
            bit = bit/k;
            multiple = k-1; //since it's an int 1/2 rounds to 0
                       }       
                       System.out.println(code);
    }        
}
    
