import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
                      // Your code here
        // BufferedReader in= new BufferedReader( new InputStreamReader(System.in));
        // int n = Integer.parseInt(in.readLine());
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        if( n < 0){
            System.exit(0);
        }//haven't added this condition so was getting run time error.

        long [] array = new long[n];
        // String [] elements = in.readLine().trim().split(" ");

        int count =0;

        for(int i=0 ; i<n ; i++){
            // array[i] = Long.parseLong(elements[i]);
            array[i] = sc.nextInt();
            if((i%2 != 0) && ((array[i]%2) ==0)){
                count++;
            }
            else if((i%2 ==0) && ((array[i]%2) !=0)){
                count++;
            }
        }

        System.out.print(count);
    }
}
