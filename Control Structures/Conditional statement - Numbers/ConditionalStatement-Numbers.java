import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       if(n ==1)
        System.out.println("one");
       else if(n ==2)
        System.out.println("two");
        else if(n ==3)
        System.out.println("three");
        else if(n ==4)
        System.out.println("four");
        else if(n ==5)
        System.out.println("five");
        else 
        System.out.println("Greater than 5");
    }
}
