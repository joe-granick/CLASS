public class BirthdayParadox {
    public static void main(String[] args)
    {
        int trials = Integer.parseInt(args[0]);
        int n = 0;
        
        for(int i = 0; i < trials; i++)
        {
            boolean sharedBirthday = false;
            boolean[] birthday = new boolean[365]; 
            while(!sharedBirthday){
                n++; //new person enters room
                int newBirthday = (int)(Math.random()*365); //new person must have one birthday out of 365 days
                if(birthday[newBirthday])
                {   sharedBirthday = true; // if new person already exists then there is a share birthday
                    break;
                }
                birthday[newBirthday] = true;
                
            }
        }
            System.out.println("Average size of group with at least one shared birthday: " + n/(double)trials);

    }
    
}
