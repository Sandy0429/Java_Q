import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
                      // Your code here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String A = in.readLine();

        if(A.charAt(A.length()-1) != '0'){
            System.out.print("No");
        }
        else{
            int sum = 0;
                for(int i =0; i < A.length() ; i++){
                    // sum += Integer.parseInt(A.charAt(i));  String.valueOf(A.charAt(i))
                    sum += Integer.parseInt(String.valueOf(A.charAt(i)));
                }
                if( sum%3 == 0){
                    System.out.print("Yes");
                }
                else{
                    System.out.print("No");
                }

        }
        
    }
}
//Unit place should be zero and sum of digit should be divisible by 3
