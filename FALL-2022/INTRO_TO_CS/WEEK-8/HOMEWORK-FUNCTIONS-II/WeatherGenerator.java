public class WeatherGenerator { 
    /* Given a location (longitude, latitude) in the USA and a month of the year, the method
     * returns the forecast for the month based on the drywet and wetwet transition 
     * probabilities tables.
     * 
     * month will be a value between 2 and 13: 2 corresponds to January, 3 corresponds to February
     * and so on. These are the column indexes of each month in the transition probabilities tables.
     * 
     * The first day of the month has a 50% chance to be a wet day, 0-0.49 (wet), 0.50-0.99 (dry)
     *
     * Use StdRandom.uniform() to generate a real number uniformly in [0,1)
     */
     public static int[] oneMonthGenerator(double longitude, double latitude, int month, double[][] drywet, double[][] wetwet)
     {
        double dryProbability = 0.0;
        double wetProbability = 0.0;
        int[] monthSim = new int[31]; //double check length of day
        /*loop through probabilities 
        *find proability of rain for lat and long
        * conditioned on today being dry
        */
        for(int i = 0; i < drywet.length; i++)
        {
            if (drywet[i][0] == longitude && drywet[i][1] == latitude)
            {
                dryProbability = drywet[i][month];
                break;
            }
        }
        /*loop through probabilities 
        *find proability of rain for lat and long
        * conditioned on today being rainy
        */
        for (int i = 0; i < wetwet.length; i++)
        {
            if(wetwet[i][0] == longitude && wetwet[i][1] == latitude)
            {
                wetProbability = wetwet[i][month];
                break;
            }
        }
        /*generate probability for each day in month
         * based on today being dry and transition probabilty for location and month
         */
        for (int i = 0; i < monthSim.length; i++) // double check bounds of index
        {
            double r = StdRandom.uniform();
            if (monthSim[i] == 0)
            {
                if (r > dryProbability) monthSim[i+1] = 1;  //double check if this should be GE
            }
            else
            {
                if(r < wetProbability) monthSim[i+1] = 1; // double check if this should LE
            }
        } 

        return monthSim;
     }

     // Returns the longest number of consecutive mode (WET or DRY) days in forecast.
     public int numberOfWetDryDays (int[] forecast, int mode)
     {
        int maxWetStreak = 0;
        return maxWetStreak;
     }

    /*
     * Analyzes the forecast array and returns the longest number of 
     * consecutive mode (which can be WET or DRY) days in forecast.
     */
     public int lengthOfLongestWetDrySpell (int[] forecast, int mode)
     {
        int maxDrystreak = 0;
        return maxDrystreak;
     }

     public static void populateTransitionProbabilitiesArrays(double[][] dry, double[][] wet, int rows)
     {

     }
    public static void main (String[] args) 
    {
        int numberOfRows    = 4001; // Total number of locations
        int numberOfColumns = 14;   // Total number of 14 columns in file 
                                    // File format: longitude, latitude, 12 months of transition probabilities
        
        // Allocate and populate arrays that hold the transition probabilities
        double[][] drywet = new double[numberOfRows][numberOfColumns];
        double[][] wetwet = new double[numberOfRows][numberOfColumns];
        populateTransitionProbabilitiesArrays(drywet, wetwet, numberOfRows);

        /*** WRITE YOUR CODE BELLOW THIS LINE. DO NOT erase any of the lines above. ***/

        // Read command line inputs 
        double longitute = Double.parseDouble(args[0]);
        double latitude  = Double.parseDouble(args[1]);
        int    month     = Integer.parseInt(args[2]);

        int[] forecast = oneMonthGenerator(longitute, latitude, month, drywet, wetwet);
        int drySpell = lengthOfLongestSpell(forecast, DRY);
        int wetSpell = lengthOfLongestSpell(forecast, WET);

        StdOut.println("There are " + forecast.length + " days in the forecast for month " + month);
        StdOut.println(drySpell + " days of dry spell.");

        for ( int i = 0; i < forecast.length; i++ ) {
            // This is the ternary operator. (conditional) ? executed if true : executed if false
            String weather = (forecast[i] == WET) ? "Wet" : "Dry";  
            StdOut.println("Day " + (i+1) + " is forecasted to be " + weather);
        }
    }

}