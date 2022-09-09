public class MaxMinFilter {
    public static void main(String[] args){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(!StdIn.isEmpty()){
            int n = StdIn.readInt();
            if (n > max) max = n;
            if(n < min) min = n;
        }
        System.out.println("max: " + max + "min: " + min);
    }
    
}
