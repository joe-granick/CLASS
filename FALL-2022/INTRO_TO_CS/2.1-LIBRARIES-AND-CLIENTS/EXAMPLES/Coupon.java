
public class Coupon {

   public static int generateCoupon(int n)
   {
       int r = (int)(Math.random()*n);
       return r;
   }

   public static int collectCoupons(int n)
   {
      boolean[] isCollected = new boolean[n];
      int count = 0;
      int distinct = 0;
      for(int i = 0; i < n; i++)
      {
         while(distinct < n){
            int r = generateCoupon(n);
            count++;
            if(!isCollected[r])
               distinct++;
            isCollected[r] = true;
            
         }
      }
      return count;
   }
   
   public static void main(String[] args)
   {
    int n = Integer.parseInt(args[0]);
    System.out.println(collectCoupons(n) + " coupons collected to reach " + n + " unique observations");
   }
}
