import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
                      // Your code here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String [] elements = in.readLine().trim().split(" ");

        int [] array = new int[n];
        
        for(int  i=0; i<n ; i++){
            array[i] = Integer.parseInt(elements[i]);
        }

        // Scanner sc = new Scanner(System.in);
        // int n= sc.nextInt();
        // int [] array = new int[n];
        // for(int i=0 ; i<n ;i++){
        //     array[i]=sc.nextInt();
        // }



        //Arrays.sort(array);
        int count=1;

        for(int i=0 ;i<n-1; i++){
            if(count ==3){
              //  System.out.print("Yes");
                break;
            }
            if(array[i] ==array[i+1]){
                count++;
            }
            else{
                count =1;
            }
        
        }

        if(count == 3){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
