
public class HarmonicCouponCollector {
   public static void main(String[] args){
      int n = Integer.parseInt(args[0]);
      int count = 0;
      int trials = Integer.parseInt(args[1]);
      boolean harmonicCalculated = false;
      double harmonic = 0.0;
      for(int k = 0; k < trials; k++){
         boolean[] isCollected = new boolean[n]; 
         int distinct = 0;
         for(int i = 0; i < n; i++)
         {

            //System.out.println(isCollected[i]);
            while(distinct < n){
               int r = (int)(Math.random()*(n));
               //System.out.println("r:" + r);
               //System.out.println(isCollected[i]);
               count++;
               if(!isCollected[r])
               {
                  distinct++;
                  isCollected[r] = true;
               }
               
               //System.out.println(isCollected[i]);
            }
            if (!harmonicCalculated) harmonic += 1.0/(i+1.0); 
         }
         if(!harmonicCalculated){
               harmonic = harmonic*n; 
               harmonicCalculated = true;
            }
      }
      System.out.println(count/(double)trials + " Avg cards before all seen w/ replacement");
      System.out.println("For set of " + n +" with replacement average number of cards reflects Sum(Harmonic(n))*n: " + harmonic);
   } 
}
