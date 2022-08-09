public class Marsaglia {
    public static void main(String[] args){
        double a, b, x, y,z;

        do{
            a = 2.0*Math.random() - 1.0;
            b = 2.0*Math.random() - 1.0;
        } while (a*a + b*b > 1.0);
        x = (2.0*a)*Math.sqrt(1 - (a*a) - (b*b));
        y = (2.0*b)*Math.sqrt(1 - (a*a) - (b*b));
        z = 1.0-2.0*((a*a) + (b*b));
        
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
        System.out.println("x: "+ x);
        System.out.println("y: "+ y);
        System.out.println("z: "+ z);
    }
    
}
