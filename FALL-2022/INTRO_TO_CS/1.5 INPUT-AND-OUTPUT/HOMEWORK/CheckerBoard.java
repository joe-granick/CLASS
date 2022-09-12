public class CheckerBoard {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        double r = Double.parseDouble(args[1]);
        StdDraw.setXscale(0, n);
        StdDraw.setYscale(0, n);
        for(int i = 0; i < n; i++){
         for(int j = 0; j < n; j++)
            { 
                if((i+j)%2 != 0)   StdDraw.setPenColor(StdDraw.BLACK);
                else               StdDraw.setPenColor(StdDraw.RED);
                StdDraw.filledSquare(i+r, j+r, r);
            }
        }
    }   
}
