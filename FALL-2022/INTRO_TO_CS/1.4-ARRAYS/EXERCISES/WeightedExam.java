public class WeightedExam {
   public static void main(String[] args)
   {
    double[] weights = {0.25, 0.25, 0.50};
    double[][] grades =
        {
            {99.0, 85.0, 98.0, 0.0},
            {98.0, 57.0, 79.0, 0.0},
            {92.0, 77.0, 74.0, 0.0}, 
            {94.0, 62.0, 81.0, 0.0},
            {99.0, 94.0, 92.0, 0.0},
            {80.0, 76.5, 67.0, 0.0},
            {76.0, 58.5, 90.5, 0.0},
            {92.0, 66.0, 91.0, 0.0},
            {97.0, 70.5, 66.5, 0.0},
            {89.0, 89.5, 81.0, 0.0},
            { 0.0,  0.0,  0.0, 0.0}
        };
   
   
    for (int i = 0; i  < grades.length; i++)
        {
            double average = 0.0;
            for(int j = 0; j < grades[i].length-1; j++)
            {
                average+=grades[i][j] * weights[j];
            }
            grades[i][grades[i].length-1] = average;
        }
    
    for (int i = 0; i  < grades.length; i++){
            for(int j = 0; j < grades[i].length; j++)
            {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    
    }

}
