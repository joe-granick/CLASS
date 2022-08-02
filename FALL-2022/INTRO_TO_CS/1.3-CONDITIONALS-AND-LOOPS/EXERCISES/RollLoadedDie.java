public class RollLoadedDie {
    //rolls die where probability of rolling 1-5 is 1/6 and getting a 6 is 5/6
    public static void main(String[] args){
        double roll = Math.random();
        double prob = (1.0/6.0);
        int dice;

        if(roll <= (1.0 * prob))      dice = 1;
        else if(roll <= (2.0 * prob)) dice = 2;
        else if(roll <= (3.0 * prob)) dice = 3;
        else if(roll <= (4.0 * prob)) dice = 4;
        else if(roll <= (5.0 * prob)) dice = 5;
        else                          dice = 6;

        System.out.print(dice);


    }
   
}
