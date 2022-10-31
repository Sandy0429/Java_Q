import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double pi = 3.1415926536;

        System.out.println(round(pi,n));

    }
    public static double round(double num, int places)
{
    double scale = Math.pow(10, places);
    double roundedNum = Math.round(num * scale) / scale;
    return roundedNum;
}
}
