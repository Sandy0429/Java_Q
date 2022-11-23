import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
                      // Your code here
        BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
        String s= in.readLine();
        String t = in.readLine();

        if(s.equals(t)){
            System.out.print("0");
        }else{
            int x=0;
            int count =0;
             int len = t.length();
            if(s.length() != t.length() ){
                
                int common = Math.abs(s.length() - t.length());
                len = Math.max(s.length() , t.length()) -common;
                count =common;
               

            }

                while(x <len){
                    if(s.charAt(x) != t.charAt(x)){
                        count++;
                    }
                    x++;
                }
            
                System.out.print(count);
        }

        
    }
}
