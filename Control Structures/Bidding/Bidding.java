import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a>=b && a>=c)
                System.out.println("Alice");
            else if(b>=a && b>=c)
                System.out.println("Bob");
            else if(c>=b && c>=a)
                System.out.println("Charlie");
        }
    }
}
