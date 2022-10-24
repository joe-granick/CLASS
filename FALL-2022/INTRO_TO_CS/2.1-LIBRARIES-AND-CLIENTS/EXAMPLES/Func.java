public class Func {
    public static int powerOfTwo (int i) {
       i *= i;
       System.out.println(i);
       return i;
    }
    public static void main (String[] args) {
       int i = 4;
       powerOfTwo(i);
       System.out.println(i);
    }
 }