public class TrainTicket {
    public static void main(String[] args){

        int age = Integer.parseInt(args[0]);
        boolean purchasedAtStation = Boolean.parseBoolean(args[1]);
        double price = 0.0;
        if (age < 120 && age >0){
            if(age>65) price = 7.50;
            else if(age >=7) price = 13.20;
            if(!purchasedAtStation) price = price*1.20;
            //Math.round() retunrs long integer type, need to multiply by 100 and cast to convert
            System.out.print("$"+(double)Math.round(price*100.0)/100.0); 
        }
        else System.out.print("Illegal input");

    }
    
}
