import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int a = sc.nextInt();
                      int b = sc.nextInt();
                      int c = sc.nextInt();
                      int d = sc.nextInt();
                float pre = ((float)(a+b+c+d)/400)*100;
                int ans = (int) pre;
                  System.out.print(ans);
    }
}
