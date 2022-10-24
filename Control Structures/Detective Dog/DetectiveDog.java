import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i= 0;i<n;i++)
        {
            int j =sc.nextInt();
            if(j>=70 && j<= 44000)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
