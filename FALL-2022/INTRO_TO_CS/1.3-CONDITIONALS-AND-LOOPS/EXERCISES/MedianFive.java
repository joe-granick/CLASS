public class MedianFive {
   public static void main(String[] args){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    int d = Integer.parseInt(args[3]);
    int e = Integer.parseInt(args[4]);
    int t;

    System.out.println("order: " + a + "," + b + "," + c +"," + d + "," + e );
    if (a > b) {
        t = a;
        a = b;
        b = t;
    }
    System.out.println("order: " + a + "," + b + "," + c +"," + d + "," + e );
    if (a > c) {
        t = a;
        a = c;
        c = t;
    }
    System.out.println("order: " + a + "," + b + "," + c +"," + d + "," + e );
    if (b > c) {
        t = c;
        c = b;
        b = t;
    }
    System.out.println("order: " + a + "," + b + "," + c +"," + d + "," + e );
    if (c > d) {
        t = c;
        c = d;
        d = t;
    }
    System.out.println("order: " + a + "," + b + "," + c +"," + d + "," + e );
    if (c > e) {
        t = c;
        c = e;
        e = t;
    }
    System.out.println("order: " + a + "," + b + "," + c +"," + d + "," + e );
    if (d > e) {
        t = d;
        d = e;
        e = t;
    }
    System.out.println("order: " + a + "," + b + "," + c +"," + d + "," + e );
    if (b > c) {
        t = c;
        c = b;
        b = t;
    }
    System.out.println("order: " + a + "," + b + "," + c +"," + d + "," + e );
    System.out.println("Median: " + c + " order: " + a + "," + b + "," + c +"," + d + "," + e );
   } 
}
