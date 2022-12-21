import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while(t>0){
        t--;
        long a = sc.nextLong();
        long b = sc.nextLong();

        if(b==(a*2+1))
		        System.out.println("YES");
		    else if(b<2*a)
		        System.out.println("NO");
		    else
		        System.out.println("YES");
      }
    }
}
