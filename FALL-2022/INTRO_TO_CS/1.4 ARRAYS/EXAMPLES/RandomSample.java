public class RandomSample {
   public static void main(String[] args){
    int m = Integer.parseInt(args[0]);
    int n = Integer.parseInt(args[1]);
    int[] perm = new int[n];

    for (int i = 0; i < n; i++){
        perm[i] = i;
    }

    for(int j = 0; j < n; j++){
        int t = j + (int)(Math.random()*(n-j));
        int tempVal = perm[t];
        perm[t] = perm[j];
        perm[j] = tempVal;

    }
    for(int k = 0; k < m; k++)
    System.out.print(perm[k] + " ");
   } 
}
