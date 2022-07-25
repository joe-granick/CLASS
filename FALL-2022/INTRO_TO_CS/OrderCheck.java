public class OrderCheck {
    public static void main(String[] args){
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);
        boolean ordered = (x <= y);
        ordered = ordered&&(y<=z);
        System.out.print("Numbers ordered? " + ordered);
    }
    
}
