public class Gas {
    public static void main(String[] args){
        double pricePerGallon = Double.parseDouble(args[0]);
        double gallonsPurchased = Double.parseDouble(args[1]);
        boolean cash = Boolean.parseBoolean(args[2]);

        if(pricePerGallon <= 0 || gallonsPurchased <= 0) System.out.print("Illegal Input");
        else{
            double total = pricePerGallon*gallonsPurchased;
            if (!cash) total = total*1.1;
            System.out.print(total);
        }


    }
}
