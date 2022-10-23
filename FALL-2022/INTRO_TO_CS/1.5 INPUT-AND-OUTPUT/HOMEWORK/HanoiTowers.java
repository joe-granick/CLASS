public class HanoiTowers
{
    public static void move(int n, boolean left)
    {
        if(n == 0) return;
        move(n-1, !left);
        if(left) 
        {
            System.out.println(n + " left");
        }
        else     
        {
            System.out.println(n + " right");
        }
        move(n-1, !left);
    }
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        boolean left = true;
        move(n, left);

    }
}