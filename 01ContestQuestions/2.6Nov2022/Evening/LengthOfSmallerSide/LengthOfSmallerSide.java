import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double smallerSide = ((2*(22/7.0)*radius)/6);
       System.out.printf("%.2f",smallerSide);
    //    System.out.println(((double) Math.round(smallerSide * 100) / 100));
    }
}
