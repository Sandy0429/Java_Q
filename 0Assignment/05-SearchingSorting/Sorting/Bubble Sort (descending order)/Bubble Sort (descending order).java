import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []array = new int[n];

        for(int i=0; i<n;i++){
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < ( n - 1 ); i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (array[j] < array[j+1]) 
        {
          int temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp;
        }
      }
    }

        for(int i=0; i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}
