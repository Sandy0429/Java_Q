import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here

        Scanner sc =new Scanner(System.in);
        char c = sc.next().charAt(0);

        if(((c >= 'A' && c <= 'Z')||c >= 'a' && c <= 'z') )
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
