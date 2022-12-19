import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// // don't change the name of this class
// // you can add inner classes if needed
// import java.io.*; // for handling input/output
// import java.util.*; // contains Collections framework

// // don't change the name of this class
// // you can add inner classes if needed
// class Main {
//     public static void main (String[] args) {
//         Scanner in = new Scanner(System.in);

//         int N = in.nextInt();
//         long currentMax = Long.MIN_VALUE; // starting points
//         long secondMax = currentMax;

//         long currentMin = Long.MAX_VALUE; // starting points
//         long secondMin = currentMin;
        
//         for (int i = 0; i < N; i++) {
//             long el = in.nextLong();

//             if (el > currentMax) {
//                 secondMax = currentMax;
//                 currentMax = el;
//             } else if (el > secondMax) {
//                 secondMax = el;
//             }

//             if (el < currentMin) {
//                 secondMin = currentMin;
//                 currentMin = el;
//             } else if (el < secondMin) {
//                 secondMin = el;
//             }
//         }

//         long firstAnswer = currentMax - secondMin;
//         long secondAnswer = secondMax - currentMin;

//         if (firstAnswer > secondAnswer) {
//             System.out.println(firstAnswer);
//         } else {
//             System.out.println(secondAnswer);
//         }
//     }
// }

class Main {
     public static int partition(long array[], int low, int high) {

    long pivot = array[high];

    int i = (low - 1);

    for (int j = low; j < high; j++) {
      if (array[j] <= pivot) {

        i++;

        long temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }

    }

    long temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;

    return (i + 1);
  }

  public static void quickSort(long array[], int low, int high) {
    if (low < high) {

      int pi = partition(array, low, high);

      quickSort(array, low, pi - 1);

      quickSort(array, pi + 1, high);
    }
  }
    
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] arr = new long[n];
        for(int i=0 ;i<n;i++)  arr[i] = sc.nextLong();

        quickSort(arr,0,n-1);

        long firstAnswer = arr[n-1] - arr[1];
        long secondAnswer = arr[n-2] - arr[0];

        if (firstAnswer > secondAnswer) {
            System.out.println(firstAnswer);
        } else {
            System.out.println(secondAnswer);
        }

        // System.out.print((arr[n-1] - arr[1]));
    }
}

/*
 long firstAnswer = currentMax - secondMin;
        long secondAnswer = secondMax - currentMin;
*/
