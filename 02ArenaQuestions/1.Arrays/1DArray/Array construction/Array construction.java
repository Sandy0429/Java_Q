import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
        // Your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [][] valueFreq = new int [n][2];

        for(int i=0;i<n;i++) valueFreq[i][0] = sc.nextInt();
        for(int i=0;i<n;i++) valueFreq[i][1] = sc.nextInt();

        int k = sc.nextInt();
        Arrays.sort(valueFreq,(a,b)->Integer.compare(a[0],b[0]));

        int counter =0;
        for(int i=0; i< valueFreq.length; i++){
            counter += valueFreq[i][1];
            if(counter >= k){
                System.out.println(valueFreq[i][0]);
                break;
            }
        }
        // for(int i=0; i<n ; i++){
        //     for(int j=0;j<2;j++)    
        //         System.out.print(valueFreq[i][j]);
        //     System.out.println();
        // }


//--------------------------------------------------------------------
        // Scanner sc = new Scanner(System.in);
	    //     int n = sc.nextInt();

	    //     int [] values = new int[n];
	    //     // int [] frequency = new int[n];
	        
	    //     ArrayList<Integer> list = new ArrayList<>();
        //     // SortedList<Integer> list = new SortedList<>();


	    //     for(int i=0;i<n;i++){
	    //         values[i]=sc.nextInt();
	    //     }
	    //     for(int i=0;i<n;i++){
	    //         // frequency[i]=sc.nextInt();
        //         int z =sc.nextInt();
	    //         // for(int k=0;k<frequency[i];k++) {
        //         for(int k=0;k<z;k++) {
	    //         	list.add(values[i]);
	    //         }
	    //     }
	    //     int index = sc.nextInt();
	    //     // sc.close();
	        
	    //     // System.out.println(list);
	    //     Collections.sort(list);
	        
	    //     System.out.println(list.get(index-1));
//getting tle



//========================================================================
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(in.readLine());

        // int [] values = new int[n];
        // int [] frequency = new int[n];

        // int cArrayElements=0;

        // String [] val = in.readLine().trim().split(" ");
        // for(int i=0;i<n;i++){
        //     // values[i]=sc.nextInt();
        //     values[i] = Integer.parseInt(val[i]);
        // }

        // String [] freq = in.readLine().trim().split(" ");
        // for(int i=0;i<n;i++){
        //     // frequency[i]=sc.nextInt();
        //     frequency[i] = Integer.parseInt(freq[i]);
        //      cArrayElements+=frequency[i];
        // }

        // // int index = sc.nextInt();

        // int index = Integer.parseInt(in.readLine());
        // int [] C = new int [cArrayElements];

        // cArrayElements = 0;
        // for(int i=0; i<n; i++){
           
        //     Arrays.fill(C, cArrayElements, (cArrayElements+frequency[i]), values[i]);
        //     //Arrays.fill(arr_name , start_index , end_index , value);
        //     cArrayElements += frequency[i];
          
        // }
        

        // Arrays.sort(C);
        // if(index>0 && index<=cArrayElements)
        //     System.out.print(C[index-1]); // getting MLE with this
    }
}
