import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
        // Your code here
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        long []arr = new long[n];
        String [] elements = in.readLine().trim().split(" ");
        for(int i=0;i<n; i++){
            // arr[i] = sc.nextInt();
            arr[i]=Long.parseLong(elements[i]);
        }

        Arrays.sort(arr);
        int chk=1;
        for(int i=0;i<n; i++){
            // System.out.println(arr[i]);
            // if(arr[i]>0){
            //     if(arr[i] == chk){
            //         chk++;
            //     }
            //     else{
            //         System.out.print(chk);
            //         System.exit(0);
            //     }
            // }//getting sum error;
            if (arr[i] == chk)
                chk++;
        }
        System.out.print(chk);
    }
}
