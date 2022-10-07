public class Speeding {
    public static void main(String[] args)
    {
        int speed = Integer.parseInt(args[0]);
        int fine ;
        if      (speed > 90) fine = 500;
        else if (speed > 75) fine = 200;
        else if (speed > 60) fine = 100;
        else fine = 0;
        System.out.print(fine);
    }
}
