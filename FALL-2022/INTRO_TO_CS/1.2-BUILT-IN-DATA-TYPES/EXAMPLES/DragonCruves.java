public class DragonCruves {
    public static void main(String args[]){

        String dragon0 = "F";
        String nogard0 = "F";

        String dragon1 = dragon0 + "L" + nogard0;
        String nogard1 = nogard0 + "R" + dragon0;

        String dragon2 = dragon1 + "L" + nogard0;
        String nogard2 = nogard1 + "R" + dragon1;

        String dragon3 = dragon2 + "L" + nogard2;
        String nogard3 = nogard2 + "R" + dragon2;

        String dragon4 = dragon3 + "L" + nogard3;
        String nogard4 = nogard3 + "R" + dragon3;

        String dragon5 = dragon4 + "L" + nogard4;
        
        System.out.println(dragon0);
        System.out.println(dragon1);
        System.out.println(dragon2);
        System.out.println(dragon3);
        System.out.println(dragon4);
        System.out.println(dragon5);






    }
    
}
