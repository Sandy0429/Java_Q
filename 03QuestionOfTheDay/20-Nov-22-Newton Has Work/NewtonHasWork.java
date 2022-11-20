import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
                      // Your code here
        BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
        String [] mn  = in.readLine().trim().split(" ");
        long days = Long.parseLong(mn[0]);
        int assignment = Integer.parseInt(mn[1]);
        long days_needed=0;

        long [] daysPerAssignment = new long[assignment];
        
        String [] elements = in.readLine().trim().split(" ");
        for(int i=0 ; i<assignment ; i++){
            daysPerAssignment[i] = Long.parseLong(elements[i]);
            days_needed += daysPerAssignment[i];
        }

        if(days_needed <= days){
            System.out.print(days-days_needed);
        }
        else{
            System.out.print(-1);
        }
    }
}
