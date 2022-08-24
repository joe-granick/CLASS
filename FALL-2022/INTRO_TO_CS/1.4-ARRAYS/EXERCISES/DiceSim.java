public class DiceSim {
   public static void main(String[] args)
   {
    int[] events = new int[13];
    double[] probs = new double[events.length];
    //calculated probability
    for (int i = 1; i <=6; i++){
        for(int j = 1; j <= 6; j++){
            events[i+j]++;
        }
        for (int k = 1; k < events.length; k++) probs[k] = events[k]/36.0;
        }
    for (int i = 2; i < events.length; i++){ System.out.println("roll:" + i + " p = " + probs[i]);}        


    //simulation estimate over n trials
    int n = Integer.parseInt(args[0]);
    double[] simFreq = new double[13];
    for(int i = 0; i < n; i++)
    {
        int diceOne = (int)(Math.random()*6)+1;
        int diceTwo = (int)(Math.random()*6)+1;
        simFreq[diceOne+diceTwo]++;

    }
    for(int i = 0; i < simFreq.length; i++) System.out.println("roll: " + i + " est(p): " + simFreq[i]/n); 
    }
}
