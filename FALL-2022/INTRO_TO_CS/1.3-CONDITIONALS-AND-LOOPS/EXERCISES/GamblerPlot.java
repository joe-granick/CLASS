public class GamblerPlot {
    public static void main(String[] args){
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int trials = Integer.parseInt(args[2]);
        int bets = 0;
        int wins = 0;

        for(int t = 0; t < trials; t++){
            int cash = stake;
            while (cash > 0 && cash < goal){
                String plot = "";
                bets++;
                if (Math.random() < 0.5) cash++;
                else                   cash--;
                for (int i = 0; i < cash; i++) plot+="*";
                System.out.println("$" + cash + ": " + plot);
            }
            
            if (cash == goal) wins++;
            
        }
        System.out.println(100*wins/trials+ "% wins");
        System.out.println("Avg # bets: " + (double)bets/(double)trials);
    }
    
}
