public class LongestPlateau {
    public static void main(String[] args)
    {
        int longestPlateau = 0;
        int maxStart = 0;
        int maxEnd = 0;
        for(int i = 1; i < args.length-2; i++)
        {
            int count = 0;
            int a = Integer.parseInt(args[i-1]);
            int b = Integer.parseInt(args[i]);
            int c = Integer.parseInt(args[i+1]);
            
            while(c == b && count < args.length-1){
                count++;
                a = Integer.parseInt(args[i-1 + count]);
                b = Integer.parseInt(args[i + count]);
                c = Integer.parseInt(args[i+1 + count]);
                System.out.print(i+count + " ");
            }
            if(count > longestPlateau) {
                longestPlateau += count;
                maxEnd = c;
                maxStart = i;
                System.out.println(count);
            }
            System.out.println(longestPlateau);
        }

        
        System.out.println("longest sequence: " + longestPlateau + " starting at : " + maxStart + " " + args[maxStart] + " ending at " + maxEnd + " " + args[maxEnd]);
    }
    
}
