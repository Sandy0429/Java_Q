import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here

        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        int s = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gc = g*a;
        int sb = s*b;
        if(gc >= sb)
            System.out.print("Gold");
        else
            System.out.print("Silver");        
    }
}
