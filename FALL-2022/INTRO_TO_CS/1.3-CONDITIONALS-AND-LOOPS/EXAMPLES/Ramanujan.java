public class Ramanujan {
    public static void main(String[] args){
        int taxicab = 1729; 
        boolean RamNum = false;
        for(int i = 0; i <= taxicab; i++){
            if(RamNum) break;
            System.out.println(i);
            for(int a = 0; (a*a*a)<= i; a++){
                if(RamNum) break;
                System.out.println("a: " + a);
                for(int b = a; (b*b*b)<=i; b++){
                    if(RamNum) break;
                    if(b == a) continue;
                    System.out.println("b: " + b);
                    if((a*a*a)+(b*b*b) == i){
                        for(int c = 0; (c*c*c)<=i; c++){
                            if(RamNum) break;
                            if(c == a || c == b) continue;
                            System.out.println("c: " + c);
                            for(int d = 0; (d*d*d)<=i; d++){
                                if(RamNum) break;
                                if(d == a || d == b || d == c) continue;
                                System.out.println("d: " + d);
                                if((c*c*c)+(d*d*d) == i){
                                    RamNum = true;
                                    System.out.println("taxicab "+ i + " a: " + a + " b: " + b + " c: " + c + " d: " + d);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
}
