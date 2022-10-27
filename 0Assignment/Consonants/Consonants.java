import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for(int i=0;i<s.length();i++)
        {
            // System.out.println(s.charAt(i));
            if(s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'o'||s.charAt(i) == 'i'||s.charAt(i) == 'u')
                  {
                       continue;
                  }
            else {
                    System.out.print(s.charAt(i));
            }
        }
    }
}
