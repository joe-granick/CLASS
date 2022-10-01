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
     int[] oneMonthGenerator(double longitute, double latitude, int month, double[][] drywet, double[][] wetwet)

     // Returns the longest number of consecutive mode (WET or DRY) days in forecast.
     int numberOfWetDryDays (int[] forecast, int mode)

    /*
     * Analyzes the forecast array and returns the longest number of 
     * consecutive mode (which can be WET or DRY) days in forecast.
     */
     int lengthOfLongestWetDrySpell (int[] forecast, int mode)
}