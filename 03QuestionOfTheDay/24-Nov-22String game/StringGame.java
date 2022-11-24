import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
                      // Your code here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine().trim();

        int i=0;
        while(i<s.length()){
            if(i%2 == 0){
                if(s.charAt(i) <= 90 && s.charAt(i)>=65){
                    System.out.print("No");
                    System.exit(0);
                }                
            }
            else{                
                if(s.charAt(i) <= 122 && s.charAt(i)>=97){
                    System.out.print("No");
                    System.exit(0);
                }
            }
            
            i++;
        }
        System.out.print("Yes");

    }
}
