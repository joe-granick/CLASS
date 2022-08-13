public class MedianFive {
   public static void main(String[] args){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    int d = Integer.parseInt(args[3]);
    int e = Integer.parseInt(args[4]);
    int t;

    if (a > c) {
        t = c;
        c = a;
        a = t;
    }
    
    if (b > c) {
        t = c;
        c = b;
        b = t;
    }

    if (d < c) {
        t = c;
        c = d;
        d = t;
    }

    if (e < c) {
        t = c;
        c = e;
        e = t;
    }
    System.out.print("Median: " + c + " order: " + a + "," + b + "," + c +"," + d + "," + e );
   } 
}
