public class Checksum {
    // finds ISBN number multiplying exach succesiv digit by 10 to 2 with last digit being evenly divisble by 11 and must be between 1 and 10
    public static void main(String[] args){
        int isbn = Integer.parseInt(args[0]);
        int divisor = 100000000;
        int checksum = 0;
        for(int i = 10; i >1; i--){
            checksum += i*(isbn/divisor); //integer division rounds down soproduces first didgit plus magnitude when divided by appropriate pwoer of 10
            isbn = isbn - (isbn/divisor)*divisor; //removes difference of current power of 10 by digit of interest
            divisor = divisor/10; //reduces power of 10 by order of magnitude
        }
        for(int i = 1; i <= 10; i++){
            if((checksum+i)%11 == 0){
                if(i == 10) System.out.print("Checksum: " + "X");
                else        System.out.print("Checksum: " + i);
                break;

            }
        }
    }
    
}

