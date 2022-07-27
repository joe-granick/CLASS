public class WCS111FM {
    public static void main(String[] args){
        
        int hours = Integer.parseInt(args[0]);
        if(hours > 400) System.out.print("Cat");
        else if(hours > 5){
            if ((hours-9)%10 == 0) System.out.println("Laptop");
            if (hours%2 == 0) System.out.println("Hat");
            if (hours%3 == 0) System.out.println("TV");
        }
        else if(hours > 0) System.out.print("T-shirt");
        else System.out.print("Nothing");
    }
    
}
