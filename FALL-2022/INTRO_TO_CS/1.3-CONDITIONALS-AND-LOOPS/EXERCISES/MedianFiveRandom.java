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
    int incorrect = 0;
    for(int i = 0; i < n; i++ ){
        boolean pass = false;
        int t;
        int a = (int)(Math.random()*1000.0);
        int b = (int)(Math.random()*1000.0);
        int c = (int)(Math.random()*1000.0);
        int d = (int)(Math.random()*1000.0);
        int e = (int)(Math.random()*1000.0);
        

        System.out.println("order: " + a + "," + b + "," + c +"," + d + "," + e );
        

        System.out.println("order: " + a + "," + b + "," + c +"," + d + "," + e );
        if (c < a) {
            t = a;
            a = c;
            c = t;
        }
        System.out.println("order: " + a + "," + b + "," + c +"," + d + "," + e );
        if (c > e) {
            t = e;
            e = c;
            c = t;
        }
        System.out.println("order: " + a + "," + b + "," + c +"," + d + "," + e );
        if (c < b) {
            t = b;
            b = c;
            c = t;
        }
        System.out.println("order: " + a + "," + b + "," + c +"," + d + "," + e );
        if (c > d) {
            t = d;
            d = c;
            c = t;
        }
        System.out.println("order: " + a + "," + b + "," + c +"," + d + "," + e );
        if (c < b) {
            t = b;
            b = c;
            c = t;
        }
        
        System.out.println("order: " + a + "," + b + "," + c +"," + d + "," + e );
        if (c < a) {
            t = a;
            a = c;
            c = t;
        }

        System.out.println("order: " + a + "," + b + "," + c +"," + d + "," + e );
        if (c > d) {
            t = d;
            d = c;
            c = t;
        }
        
        if(c>= a && c >= b && c <= d && c <= d) pass = true;
        System.out.println("Median: " + c + " order: " + a + "," + b + "," + c +"," + d + "," + e );
        if(pass) System.out.println("CORRECT");
        else {
            System.out.println("INCORRECT");
            incorrect++;
        }
    }
    System.out.println("Incorrect: " + incorrect);
   } 
}
