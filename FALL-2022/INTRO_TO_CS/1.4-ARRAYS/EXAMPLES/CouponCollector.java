public class CouponCollector {
   public static void main(String[] args){
      int n = Integer.parseInt(args[0]);
      boolean[] isCollected = new boolean[n];
      int count = 0;
      
      for(int i = 0; i < n; i++)
      {
         //System.out.println(isCollected[i]);
         while(isCollected[i] == false){
            int r = (int)(Math.random()*(n));
            //System.out.println("r:" + r);
            //System.out.println(isCollected[i]);
            count++;
            isCollected[r] = true;
            //System.out.println(isCollected[i]);
         }
         
      }
      System.out.println(count + " Trials");
   } 
}
