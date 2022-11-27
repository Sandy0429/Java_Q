import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String s = in.readLine().trim();
       
        System.out.print(reverseStringStringBuilder(s));

    }
  
    public static String reverseStringStringBuilder(String str){
      StringBuilder ansString = new StringBuilder();
      for(int i = str.length()-1 ; i>=0 ; i--){
        char ch = str.charAt(i);
        ansString.append(ch);
      }
      return ansString.toString();
    }
  
}
