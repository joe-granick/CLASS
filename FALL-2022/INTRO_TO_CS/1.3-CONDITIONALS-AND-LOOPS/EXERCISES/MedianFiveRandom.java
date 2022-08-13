public class MedianFiveRandom {
   public static void main(String[] args){
    /* 
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    int d = Integer.parseInt(args[3]);
    int e = Integer.parseInt(args[4]);
    */
    int n = Integer.parseInt(args[0]);
    for(int i = 0; i < n; i++ ){
    
    int t;
    int a = (int)(Math.random()*4.0 +1.0);
    int b = (int)(Math.random()*4.0 +1.0);
    int c = (int)(Math.random()*4.0 +1.0);
    int d = (int)(Math.random()*4.0 +1.0);
    int e = (int)(Math.random()*4.0 +1.0);

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
    if (e < d) {
        t = e;
        e = d;
        d = e;
    }
    System.out.println("order: " + a + "," + b + "," + c +"," + d + "," + e );
    if (e < c) {
        t = e;
        e = c;
        c = t;
    }
    System.out.println("order: " + a + "," + b + "," + c +"," + d + "," + e );
    if (d < c) {
        t = d;
        d = c;
        c = t;
    }

    System.out.println("Median: " + c + " order: " + a + "," + b + "," + c +"," + d + "," + e );
}
   } 
}
