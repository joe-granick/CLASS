public class TwoSmallest {
    public static void main(String[] args){
        int count = args.length;
        int i = 0;
        double min_val = Double.MAX_VALUE;
        double next_min = Double.MAX_VALUE;
        double check_val;
        while(i<count){
            check_val = Double.parseDouble(args[i]);
            if(min_val >= check_val){ //>= so that next min will be assigned when there is a duplicate min val
                next_min = min_val;
                min_val = check_val;
            } 
            i++;
        }
        System.out.println(min_val);
        System.out.println(next_min);
    }
        `
}
