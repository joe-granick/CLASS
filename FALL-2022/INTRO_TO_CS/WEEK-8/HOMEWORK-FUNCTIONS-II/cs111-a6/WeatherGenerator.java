
/*
 *
 * @author: jgranick email: jgranick@scarletmail.rutgers.edu
 * 
 * To generate weather for location at longitude -98.76 and latitude 26.70 for
 * the month of February do:
 * java WeatherGenerator -98.76 26.70 3
 */

public class WeatherGenerator {

    static final int WET = 1; // Use this value to represent a wet day
    static final int DRY = 2; // Use this value to represent a dry day 
    
    // Number of days in each month, January is index 0, February is index 1...
    static final int[] numberOfDaysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    /* 
     * Description:
     *      this method works under the assumption that under the same directory as WeatherGenerator.java, 
     *      there exist drywet.txt and wetwet.txt that contains probabilities of the next day being wet 
     *      with today being a dry/wet day.  
     * Parameters:
     *      drywet & wetwet: 
     *          2 empty 2D arrays that will be populated, with each row in the format of:
     *          {Longitude, Latitude, January, February, March, April, May, June, July, August, September, October, November, December}
     *          {-97.58,    26.02,    0.76,    0.75,     0.77,  0.74, 0.80, 0.86, 0.94, 0.97,   0.89,      0.77,    0.74,     0.77}
     *          you can assume that there more than enough data in the txt file, 
     *          when there are more data in the txt files than what drywet & wetwet can store, store it up to the array size
     * Return:
     *      this method does not return data, the method is used to populate two 2D arrays with 14 
     *      columns - drywet and wetwet.
     * Example:
     *      double[][] drywet = new double[4100][14];
     *      double[][] wetwet = new double[4100][14];
     *      populateArrays(drywet, wetwet);
     */
    public static void populateArrays(double[][] drywet, double[][] wetwet) {

        StdIn.setFile("drywet.txt");

	for(int i=0; i < drywet.length; i++){
            for(int j=0; j<14; j++){
                drywet[i][j] = StdIn.readDouble();
            }
        }

	StdIn.setFile("wetwet.txt");

	for(int i=0; i < drywet.length; i++){
            for(int j=0; j<14; j++){
                wetwet[i][j] = StdIn.readDouble();
            }
        }
    }

    /* 
     * Description:
     *      this method uses drywet and wetwet arrays populated by populateArrays, and longitude and latitude
     *      of the target location to populate drywetProbability and wetwetProbability with the 
     *      probability of dry/wet day is followed by a wet day each month at that location.
     *      In other words, extracting the probabilities of the location.
     * parameters:
     *      drywetProbability:  array of size 12 that will be populated with by the probability of dry days
     *                          followed by a wet day each month 
     *      wetwetProbability:  array of size 12 that will be populated with by the probability of wet days
     *                          followed by a wet day each month 
     *      longitude: 
     *          the longitude of the location 
     *      latitude:  
     *          the latitude  of the location 
     *      drywet: 
     *          a 2D array of doubles populated by the method populateArrays() using drywet.txt 
     *      wetwet: 
     *          a 2D array of doubles populated by the method populateArrays() using wetwet.txt 
     * return:
     *      this method does not return data. The method is used to populate two 1D arrays of length
     *      12 - drywetProbability and wetwetProbability. 
     *      The probability of January is stored at index 0, February stored at index 1...
     * example:
     *      //drywet, wetwet are populated by the method populateArrays
     *      double[] drywetProbability = new double[12];
     *      double[] wetwetProbability = new double[12];
     *      populateLocationProbabilities(drywetProbability, wetwetProbability, -97.58, 26.02, drywet, wetwet); 
     *      drywetProbability will contain the value of: 
     *          [0.37, 0.43, 0.38, 0.48, 0.42, 0.49, 0.57, 0.70, 0.48, 0.44, 0.44, 0.36]
     *      wetwetProbability will contain the value of: 
     *          [0.76, 0.75, 0.77, 0.74, 0.80, 0.86, 0.94, 0.97, 0.89, 0.77, 0.74, 0.77]
     */
    public static void populateLocationProbabilities( double[] drywetProbability, double[] wetwetProbability, 
                                     double longitude, double latitude, 
                                     double[][] drywet, double[][] wetwet){

        // COMPLETE THIS METHOD

        for(int i = 0; i < drywet.length; i++)
        {
            if(drywet[i][0] == longitude && drywet[i][1] == latitude)
            {
                for(int j = 0; j < 12; j++)
                {
                    drywetProbability[j] = drywet[i][j+2];
                    wetwetProbability[j] = wetwet[i][j+2];
                }
                //System.out.println("populateLocationProbabilities month: " + i + " drywet " + drywetProbability[i] + " wetwt " + wetwetProbability[i]);
            }
        }
    }
    /* 
     * Description:
     *      Given the number of days in a month, and probabilities of weather changing at a certain location, 
     *      the method should return  the forecast for the month.
     *      The first day of the month has a 50% chance to be a wet day, [0,0.5) (wet), [0.5,1) (dry)
     *      Use StdRandom.uniform() to generate a real number uniformly in [0,1)
     * parameters:
     *      drywetProbability: 
     *          a double representing the probability of next day being a wet day when the current day is a dry day.
     *      wetwetProbability:
     *          a double representing the probability of next day being a wet day when the current day is a wet day.
     *      numberOfDays:
     *          an integer representing how many days are in this month.
     * return:
     *      The return should be an integer array of 1 and 2s, with the size equal to the size of the month 
     *      1 meaning the day is a wet day, 2 being a dry day. Index 0 being the first day of the month; 
     * example:
     *      int[] forecast = forecastGenerator( 0.27,  0.55, 31);
     *      Here, forecast shoule be a size 31 array of 1s and 2s, although the probability is determined, the
     *      return result will still be different for each run since it is randomly generated. 
     */
    public static int[] forecastGenerator(double drywetProbability, double wetwetProbability, int numberOfDays) {
        
        // COMPLETE THIS METHOD
        int[] forecast = new int[numberOfDays];
        double r = StdRandom.uniform();
        double prob = 0.5;
        if(r < prob) forecast[0] = WET; //if rannom number is less than .5 RAIN
        else                          forecast[0] = DRY; //if random num greater or equal .5 DRY
        //System.out.println("Day: " + 0 + " Transition Probability " + "INIT" + " p: " + prob + " r: " + r + "forecast " + forecast[0]);
        for(int i = 1; i < numberOfDays; i++)
        {
            //String transitionState;

            if (forecast[i-1] == WET) 
            {
                prob = wetwetProbability; //probability of rain if previous day was wet 
                //transitionState = "WET";
            }
            else                      
            {
                prob = drywetProbability; //probability of rain if previous day was wet
                //transitionState = "DRY";
            }
            
            r = StdRandom.uniform();
            //System.out.println("r: " + r);
            //System.out.println("p: " + prob);
            if (r < prob) forecast[i] = WET; 
            else          forecast[i] = DRY;
            //System.out.println("Day: " + i + " Transition Probability " + transitionState + " p: " + prob + " r: " + r + "forecast " + forecast[i]);
        }

        return forecast; 
    }

    /* 
     * Description:
     *      This method takes the number of locations that is stored in wetwet.txt and drywet.txt (the number of
     *      lines in each file), and takes in the month number (January is index 0, February is index 1... ),  
     *      and the longitude and the latitude of the location we want to make the prediction on.
     *      This method calls all previous methods (populateArrays(), populateLocationProbabilities(), 
     *      forecastGenerator() in this order). 
     *      This is the only method directly called by main method to generate a forecast
     * The general flow of the method:
     *      Firstly,    use populateArrays() to extract all data into 2D arrays.
     *      Secondly,   use populateLocationProbabilities to get the probability  data of the target location
     *      Lastly,     pass in the probability  data of the month into forecastGenerator to generate a forecast
     * parameters:
     *      numberOfLocations:
     *          an interger representing how many lines exists in wetwet.txt and drywet.txt
     *      month: 
     *          an integer representing the month of the prediction (January is index 0, February is index 1...)
     *      longitude:
     *          a double representing the longitude of the target location.
     *      latitude:
     *          a double representing the latitude of the target location.
     * return:
     *      return should be an integer array of 1 and 2s, with the size equal to the size of the month 
     *      1 meaning the day is a wet day, 2 being a dry day. index 0 being the first day of the month; 
     * example:
     *      oneMonthForecast( 4100, 0, -97.58, 26.02);
     *      this method call should returns an size 31 array with 1s and 2s, 
     *      the return result will be different for each run since it is randomly generated. 
     */
    public static int[] oneMonthForecast(int numberOfLocations, int month, double longitude, double latitude ){
        
        // COMPLETE THIS METHOD
        double[][] drywet = new double[numberOfLocations][14];
        double[][] wetwet = new double[numberOfLocations][14];
        populateArrays(drywet, wetwet);

        double[] drywetProbability = new double[12];
        double[] wetwetProbability = new double[12];
        populateLocationProbabilities(drywetProbability, wetwetProbability, longitude, latitude, drywet, wetwet);

        double dryToWet = drywetProbability[month];
        double wetToWet = wetwetProbability[month];
        //System.out.println("Dry to wet p: " + dryToWet + " wet to wet p" + wetToWet);
        int[] forecast =  forecastGenerator(dryToWet, wetToWet, numberOfDaysInMonth[month]);
       
        return forecast;
    }

    /********
     * 
     * * Methods to analyze forecasts 
     * 
     ******/

    /* 
     * Description:
     *      Returns the number of mode (WET or DRY) days in forecast.
     * parameters: 
     *      forecast: 
     *          an integer array of 1 and 2s, with the size equal to the size of the month 
     *          1 represents that the day is a wet day, 2 represents a dry day. 
     *          index 0 is the first day of the month; 
     *      mode:
     *          an integer with value of 1 (WET) or 2 (DRY). 
     *          1 means the method returns the number wet days.
     *          2 means the method returns the number dry days.
     * return:
     *      returns the number of mode (WET or DRY) days in forecast
     * example:
     *      int[] arr1 = {WET,DRY,DRY,DRY};
     *      System.out.println(lengthOfLongestSpell(arr, DRY)); //prints out 3
     *      System.out.println(lengthOfLongestSpell(arr, WET)); //prints out 1
     */ 
    public static int numberOfWetDryDays (int[] forecast, int mode) {
        
        // COMPLETE THIS METHOD
        int days = 0;
        for (int i = 0; i < forecast.length; i++)
        {
            if (forecast[i] == mode)
                days++;
        }
        return days; 
    }

    /* 
     * Description:
     *      Find the longest number of consecutive mode (WET or DRY) days in forecast.
     * parameters:
     *      forecast: 
     *          an integer array of 1 and 2s, with the size equal to the month number of days 
     *          represents that the day is a wet day, 2 represents a dry day. 
     *          index 0 is the first day of the month; 
     *      mode:
     *          an integer with value of 1 or 2. 
     *          1 means the method returns the longest stretch of consecutive wet days.
     *          2 means the method returns the longest stretch of consecutive dry days.
     * return:
     *      returns the longest number of consecutive mode (WET or DRY) days in forecast.
     * example:
     *      int[] arr = {1,2,2,1,2,1,2,2,1,1,2,1, 2,2,2,2,2,2,2,2,2, 1,2,1,2,1,2,1,2}
     *      System.out.println(lengthOfLongestSpell(arr), DRY); //prints out 9
     */ 
    public static int lengthOfLongestSpell (int[] forecast, int mode) {
        
        // COMPLETE THIS METHOD
        int longestSpell = Integer.MIN_VALUE;
        int currentSpell = 0;
        if (forecast[0] == mode) currentSpell = 1;
        for(int i = 1; i < forecast.length; i++){
            if (forecast[i] == forecast[i-1] && forecast[i] == mode) currentSpell++;
            else
            {
                if (currentSpell > longestSpell) longestSpell = currentSpell;
                currentSpell = 1;
            } 
        }
        if (currentSpell > longestSpell) longestSpell = currentSpell;
        return longestSpell;
    }

    /* 
     * Description:
     *      Given the forecast of a month at certain location, this method finds the index of the
     *      first day of a 7 day period with the least amount of rain. If multiple exist, return 
     *      the earliest.
     * parameters:
     *      forecast: 
     *          an integer array of 1 and 2s, with the size equal to the month number of days 
     *          1 represents the day is a wet day, 2 being a dry day. 
     *          index 0 is the first day of the month; 
     * return:
     *      returns the index of the first day of the 7 days period with the most dry days in forecast.
     *      (use the earliest 7 days period with the most dry days)
     * example:
     *          //index: 0 1 2 3 4 5 6 7 8 9 10 11  12...
     *      int[] arr = {1,2,2,1,2,1,2,2,1,1,2, 1,  2,2,2,2,2,2,2,2,2,  1,2,1,2,1,2,1,2}
     *      System.out.println(lengthOfLongestSpell(arr)); //prints out 12
     */ 
    public static int bestWeekToTravel(int[] forecast){
        
        // COMPLETE THIS METHOD
        int maxIndex = 0;
        int maxDry = Integer.MIN_VALUE;
        int daysInMonth = forecast.length;
        for (int i = 0; i < daysInMonth; i++)
        {
            int dryDays = 0;
            for (int j = 0; (j < 7) && ((j+i) < daysInMonth); j++)
            {
                if(forecast[i+j] == DRY) dryDays++;
            }
            
            if(dryDays > maxDry)
            {
                maxIndex = i;
                maxDry = dryDays;
            }
        }
        return maxIndex;

    }

    /*
     * Reads the files containing the transition probabilities for US locations.
     * Execution:
     *   java WeatherGenerator -97.58 26.02 3
     */
    public static void main (String[] args) {
        //StdRandom.setSeed(1667235513585L);
        /*int[] test16 = forecastGenerator(0.14530338573740473, 0.7586459705038652, 31);
        for(int i = 0; i < test16.length; i++)
            System.out.print(test16[i] + " ");
        System.out.println();*/

        //StdRandom.setSeed(1667235513638L);
        /*int[] test17 = forecastGenerator(0.366293010257578, 0.27297111179052025, 30);
        for(int i = 0; i < test17.length; i++)
            System.out.print(test17[i] + " ");
        System.out.println();*/
        //StdRandom.setSeed(1617155768130L); //example
        
        
        // File format: longitude, latitude, 12 months of transition probabilities
         // TEST CASE 76
        /*
        StdRandom.setSeed(1667230004659L); 
        int numberOfRows    = 4100; // Total number of locations
        double longitude = -98.01;
        double latitude  = 28.12;
        int    month     = 5;
        */

        // TEST CASE 69
        /* 
        StdRandom.setSeed(1667230002748L); //test 69
        int numberOfRows    = 4100; // Total number of locations
        double longitude = -112.99;
        double latitude  = 48.98;
        int    month     = 10;
        */

        // TEST CASE 70
        /* 
        StdRandom.setSeed(1667230003018L); 
        int numberOfRows    = 4100; // Total number of locations
        double longitude = -77.20;
        double latitude  = 36.61;
        int    month     = 11;
        */        

        // TEST CASE 75
        /* 
        StdRandom.setSeed(1667230004392L); 
        int numberOfRows    = 4100; // Total number of locations
        double longitude = -89.46;
        double latitude  = 40.17;
        int    month     = 1;
        */

        // TEST CASE 76
        
        //StdRandom.setSeed(1667230004659L); 
        /*int numberOfRows    = 4100; // Total number of locations
        double longitude = -98.01;
        double latitude  = 28.12;
        int    month     = 5;
        
        
        int[] forecast = oneMonthForecast( numberOfRows,  month,  longitude,  latitude );


    
        int drySpell = lengthOfLongestSpell(forecast, DRY);
        int wetSpell = lengthOfLongestSpell(forecast, WET);
        int bestWeek = bestWeekToTravel(forecast);

        StdOut.println("There are " + forecast.length + " days in the forecast for month " + month);
        StdOut.println(drySpell + " days of dry spell.");
        StdOut.println(wetSpell + " days of wet spell.");
        StdOut.println("The bestWeekToTravel starts on:" + bestWeek );

        for ( int i = 0; i < forecast.length; i++ ) {
            // This is the ternary operator. (conditional) ? executed if true : executed if false
            String weather = (forecast[i] == WET) ? "Wet" : "Dry";  
            StdOut.println("Day " + (i) + " is forecasted to be " + weather);
        }*/

        int numberOfRows    = 4100; // Total number of locations
        int numberOfColumns = 14;   // Total number of 14 columns in file 
        
        // File format: longitude, latitude, 12 months of transition probabilities
        double longitude = Double.parseDouble(args[0]);
        double latitude  = Double.parseDouble(args[1]);
        int    month     = Integer.parseInt(args[2]);
        
        int[] forecast = oneMonthForecast( numberOfRows,  month,  longitude,  latitude );
        

        int drySpell = lengthOfLongestSpell(forecast, DRY);
        int wetSpell = lengthOfLongestSpell(forecast, WET);
        int bestWeek = bestWeekToTravel(forecast);

        StdOut.println("There are " + forecast.length + " days in the forecast for month " + month);
        StdOut.println(drySpell + " days of dry spell.");
        StdOut.println("The bestWeekToTravel starts on:" + bestWeek );

        for ( int i = 0; i < forecast.length; i++ ) {
            // This is the ternary operator. (conditional) ? executed if true : executed if false
            String weather = (forecast[i] == WET) ? "Wet" : "Dry";  
            StdOut.println("Day " + (i) + " is forecasted to be " + weather);
        }
    }
}
