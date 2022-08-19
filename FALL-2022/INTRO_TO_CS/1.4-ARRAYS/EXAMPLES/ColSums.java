/*For spreadsheeet implemented with 2D
 * Sums each column of numbers
 * Processing done in row-major order
 */
public class ColSums {
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
        
        for (int j = 0; j < n-1; j++){
            int colSum = 0;
            for(int i = 0; i < m-1; i++){
                colSum += a[i][j];
            }
            a[m-1][j] = colSum;
        }
        for (int j = 0; j < n; j++) System.out.print(a[m-1][j] + " ");

    }    
}
