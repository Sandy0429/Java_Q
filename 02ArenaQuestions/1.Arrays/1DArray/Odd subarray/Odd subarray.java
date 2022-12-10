import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {

        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int [] arr = new int[sizeOfArray];

        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        long count =0;
        boolean b1 = true;
        for(int i=0,j=0; i<arr.length ; i++){
            if((arr[i]&1)==1){
                if(b1 == true){
                    count = count+1+j;
                    j++;
                }
                else{
                    count = count+1;
                    b1=true;
                    j++;
                }
            }
            else{
                b1= false;
                j=0;
            }
        }
        System.out.print(count);

                      // Your code here
        // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(in.readLine());
        // String [] elements = in.readLine().trim().split(" ");
        // int [] array = new int[n];        
        // int t =0,k=0;
        // int count =0;

        // for(int i=0;i<n; i++){
        //     array[i] = Integer.parseInt(elements[i]);
        //     if((array[i]%2) != 0){
        //         count++;
        //         if(t == (i-k)){
        //             count++;
        //             k++;
        //         }
        //         else{
        //             t=i;
        //             k=0;
        //         }
        //     }
        // } 
        // System.out.print(count);  

        // Arrays.sort(arrayOdd);
        // // System.out.println(t+" "+n);
        // if(t==n) t=0;
        // for(int i = t;i<n-1;i++){
        //      int total =1;
        //     for(int j=i+1; j<n; j++){
        //        if(arrayOdd[i] != arrayOdd[j])
        //         {
        //         int check = arrayOdd[i]* arrayOdd[j];
        //         // System.out.println("check: "+check);

        //         total = total*check;
        //         // System.out.println("total: "+total);
                
        //         if((check%2) != 0){
        //             count++;
        //         }
        //         if((i != (n-2)) && ((total%2) != 0) && (j !=(i+1))){
        //             count++;
        //         }
        //       }
        //     }
        // }
        //  System.out.print(count);

        // Arrays.sort(array);
        // //  System.out.println(count);

        // for(int i=0; i<n-1; i++){
        //     int total =1;
        //     for(int j=i+1; j<n; j++){
        //        if(array[i] != array[j])
        //         {
        //         int check = array[i]* array[j];
        //         // System.out.println("check: "+check);

        //         total = total*check;
        //         // System.out.println("total: "+total);
                
        //         if((check%2) != 0){
        //             count++;
        //         }
        //         if((i != (n-2)) && ((total%2) != 0) && (j !=(i+1))){
        //             count++;
        //         }
        //       }
        //     }
        // }

        // System.out.print(count);        

    }
}
