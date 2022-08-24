public class LongestPlateau {
    /*find longest sequence of equivalent number where number preceding and following
     * are less than the number of the sequence
    */

    public static void main(String[] args)
    {
        int longestPlateau = 0;
        int maxStart = 0;
        int maxEnd = 0;
        for(int i = 1; i < args.length-1; i++)
        {
            int count = 0;
            int a = Integer.parseInt(args[i-1]);
            int b = Integer.parseInt(args[i]);
            int c = Integer.parseInt(args[i+1]);
            //continues count at start of i while each succesive number is equal
            while(c == b && (i+1+count) < args.length-1){
                count++;
                a = Integer.parseInt(args[i-1+count]);
                b = Integer.parseInt(args[i+count]);
                c = Integer.parseInt(args[i+1+count]);
                //System.out.println(a + " " + c);
            }
            count++;
                //count++; //needed to include last number in sequence
            // checks that count > current longest and 
            if(count > longestPlateau && c < b) {
                longestPlateau = count;
                maxEnd = i+count-1;
                maxStart = i;
                //System.out.println(count);
            }
            //System.out.println(longestPlateau);
        }

        
        System.out.println("longest sequence: " + longestPlateau + " starting at : " + maxStart  + " ending at " + maxEnd);
        System.out.println();
        for(int i = maxStart-1; i <= maxEnd+1; i++) System.out.print(args[i]);
    }
    
}
