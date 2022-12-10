import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
        // Your code here

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // String s =in.readLine();
        // System.out.print(removeSpaceAndTabs(s));

        StringBuilder str = new StringBuilder();
        str.append(in.readLine());
        System.out.print(removeSpaceAndTabs(str));
    }

    // public static String removeSpaceAndTabs(String str){            
    //     return str.replaceAll("\\s","");
    // } // not using recursion

    public static String removeSpaceAndTabs(StringBuilder str){ 
        
        if(str.length() == 0)
            return "";
        
        StringBuilder ans = new StringBuilder();
    

        if(str.charAt(0) != ' ')
            ans.append(str.charAt(0));
  

        str.deleteCharAt(0);           
       ans.append(removeSpaceAndTabs(str));

        return ans.toString();
    }
  
   //using String
    public static String removeSpace(String str){
        if(str.length() == 0){
            return "";
        }

        if(str.charAt(0) == ' ' || str.charAt(0) =='\t'){
            return removeSpace(str.substring(1));
        }

        char ch = str.charAt(0);
        String faithAns = removeSpace(str.substring(1));
        return ch + faithAns;
    }
}
