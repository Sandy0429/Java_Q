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
        long count=0;

        
        // for(int i=1 ; i<(n) ; i++){ //r
        //     for(int j=1 ; j<n ; j++){ //g
        //         if((i*j)<=n){
        //             for(int k=1 ; k<n ; k++){ //b
        //                 if((i*j+k) <= n){
        //                     count++;
        //                 }
        //             }
        //         }
        //         else{
                   
        //             break;
        //         }
        //     }
            
        // }
        // --TLE
    //    System.out.println(Integer.MAX_VALUE);



        // for(int i=1;i<n ;i++){
        //     for(int j=1; j<n; j++){
        //         if(i*j<n){
        //             int temp =1;
        //             while(i*j+temp <=n){
        //                 count++;
        //                 temp++;
        //             }
        //         }
        //     }
        // }

        // for(int i=1 ; i<n ; i++){
        //     for(int j=1 ; j<n ; j++){
        //         if(i*j <n){
        //             count= count+(n-i*j);
        //         }
        //     }
        // }
        // System.out.println(count);        

        for(int i=1 ;i<n; i++){
            for(int j=1 ;j<n ;j++){
                if(i*j >n){
                    break;
                }else{
                    count += n-i*j;
                }
            }
        }
        System.out.println(count);        

    }
}


/*
    R*G+B <= N

    R*G < N-B;

    

*/
