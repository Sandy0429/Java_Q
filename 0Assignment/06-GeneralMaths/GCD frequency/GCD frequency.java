import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        long [] arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        countFrequency(arr,n);

        long total =0;
        for(int i=0; i<n ; i++ ){
            if(map.containsKey(arr[i])){
                total += gcd(arr[i], map.get(arr[i]));
            }
        }
        System.out.print(total);
    }

    public static Map<Long,Long> map = new HashMap<>();
    public static void countFrequency(long []arr, int size){
        for(int i=0;i<size; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1l);
            }
        }
    }

    public static long gcd(long n1, long n2){
        if(n1%n2 != 0){
            return gcd(n2,n1%n2);
        }

        return n2 ;
    }
}
