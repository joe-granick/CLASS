public class FilterSeq {
    public static void main(String[] args){
        int num  = StdIn.readInt();
        StdOut.print(num + " ");
        while(!StdIn.isEmpty()){
            int next = StdIn.readInt();
            if(next != num) StdOut.print(next + " ");
            num = next;
        }
    }
}
