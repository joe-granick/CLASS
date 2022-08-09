public class Marsaglia {
    public static void main(String[] args){
        double a, b, c, x, y;

        do{
            x = 2.0*Math.random() - 1.0;
            y = 2.0*Math.random() - 1.0;
        } while (x*x + y*y > 1.0);
        a = (2.0*x)*Math.sqrt(1 - (x*x) - (y*y));
        b = 2.0*Math.sqrt(1 - (x*x) - (y*y));
        c = 1.0-2.0*((x*x) + (y*y));
        
        System.out.println("x: "+ x);
        System.out.println("y: "+ y);
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
        System.out.println("c: "+ c);
    }
    
}
