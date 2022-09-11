public class WordCount {
    public static void main(String[] args)
    {
        int words = 0;
        while(!StdIn.isEmpty())
        {
            StdIn.readString();
            words++;
        }
        StdOut.print(words);
    }
    
}
