import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Integer []arr1 = {1,3,5,7,8,10,12};
        Integer [] arr2 = {4,6,9,11};
        Integer []arr3 = {2};

        // System.out.println(Arrays.asList(arr1).contains(x));
        if(Arrays.asList(arr1).contains(x) && Arrays.asList(arr1).contains(y)){
            System.out.print("Yes");
        }
        else if(Arrays.asList(arr2).contains(x) && Arrays.asList(arr2).contains(y)){
            System.out.print("Yes");
        }
        else if(Arrays.asList(arr3).contains(x) && Arrays.asList(arr3).contains(y)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
