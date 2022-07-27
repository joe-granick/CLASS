public class ThreeSort {
    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]); 
        
       int first = Math.min(Math.min(x, y), Math.min(y, z));

       int second = Math.min(Math.min(Math.max(x, y), Math.max(y, z)), Math.max(x, z));

       int third = Math.max(Math.max(x, y), Math.max(y, z));


    

        System.out.print(first + " " + second + " " + third);
        
    }
}
