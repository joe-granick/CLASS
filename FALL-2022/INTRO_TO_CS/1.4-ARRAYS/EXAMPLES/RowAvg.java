/*For spreadsheeet implemented with 2D
 * Sums each row of numbers
 * Counts all columns
 * Calculates average for each row
 * Processing done in column-major order
 */
public class RowAvg {
    public static void main(String[] args){
        double[][] a =
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
        int m = a.length;
        int n = a[0].length;
        
        for (int i = 0; i < m-1; i++){
            double rowSum = 0.0;
            int rowCount = 0;
            for(int j = 0; j < n-1; j++){
                rowSum += a[i][j];
                rowCount++;
            }
            a[i][n-1] = rowSum/rowCount;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }    
}
