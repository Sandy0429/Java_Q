import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if(a >= b && a >= c && a >= d)
            System.out.print(a);
        else if(b >= a && b >= c && b >= d)
            System.out.print(b);
        else if(c >= b && c >= a && c >= d)
            System.out.print(c);
        else    
            System.out.print(d);
    }
}
