import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
        // Your code here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String [] date = in.readLine().trim().split("/");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        //to tell whether the date if before or after 20 June 2022.
        
        if(year > 2022){
            System.out.print("After");
        }
        else if(year < 2022){
            System.out.print("Before");
        }
        else{
            if(month > 6){
                System.out.print("After");
            }
            else if(month < 6){
                 System.out.print("Before");
             }
             else{
                 if(day >= 20){
                        System.out.print("After");
                    }
                    else if(day < 20){
                        System.out.print("Before");
                    }

             }
        }
    }
}
