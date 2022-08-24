public class RandomTest{
    public static void main(String[] args){
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        for(int i = 0; i < n; i++) System.out.print((int)(Math.random()*m) + " ");

    }
}