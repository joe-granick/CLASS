public class Rumors {
    public static void main(String[] args)
    {
        
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int fullSpread = 0;
        for(int trial = 0; trial < trials; trial++)
        {
            boolean[] rumorsHeard = new boolean[n];// tracks whether
            int[] rumorPropagators = new int[n]; // contains "deck" of people with potential to propagate
            for (int i = 0; i < n; i++) rumorPropagators[i] = i;
            int spreadTo = Integer.MAX_VALUE;
            int r = (int)(Math.random()*n);
            int spreadFrom = rumorPropagators[r];
            rumorsHeard[spreadFrom] = true;
            int swap = rumorPropagators[n-1];
            rumorPropagators[n-1] = spreadFrom;
            rumorPropagators[r] = swap; 
            int count = 0;
            while(true){
                do{
                r = (int)(Math.random()*(n-1)); // propagator can't be accessed stored in n-1
                }while(rumorPropagators[r] == spreadTo); 

                spreadTo = rumorPropagators[r];
                // if the person already heard the rumor terminate trial
                if(rumorsHeard[spreadTo]) {
                    System.out.println(spreadTo + ": already heard the rumor");
                    break;
                }
                rumorsHeard[spreadTo] = true;
                spreadFrom = rumorPropagators[n-1]; //the person who spread the rumor stored in n-1
                System.out.println(spreadFrom +" ==========> " + spreadTo);
                rumorPropagators[n-1] = spreadTo; //person who recieves now becomes propagtaor
                rumorPropagators[r] = spreadFrom; //previous propator swapped back into who they propgated to's slot
                count++;
                if (count == n-1){
                    System.out.println("Full spread");
                    fullSpread++;
                    break;
                }
            }
        }
        System.out.println(100.0*(fullSpread/(double)trials) + "% of parties size " + n + " will fully propogate the rumor");
    }
}
