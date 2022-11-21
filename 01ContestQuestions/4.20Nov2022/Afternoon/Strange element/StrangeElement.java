import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    // public static boolean checkRow(int[][] arr,int i){
    //     for(int col=0 ; col<arr[0].length;col++){
    //         if(arr[i][col] != 1){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // public static boolean checkCol(int[][]arr,int j){
    //     for(int row=0; row<arr.length; row++){
    //         if(arr[row][j] !=1){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    public static void main (String[] args)throws IOException {
                      // Your code here
        BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
        String [] rowCol = in.readLine().trim().split(" ");
        int row = Integer.parseInt(rowCol[0]);
        int col = Integer.parseInt(rowCol[1]);
         int [][] array = new int[row][col];

        int []arr_zero = new int[col];

         int total_elements = row*col;
         int op =total_elements;
         int count_row = 0;
         

         for(int i=0 ; i<row ; i++){
             String [] elements = in.readLine().trim().split(" ");
             boolean ch = true;
             for (int j=0 ;j<col ; j++){

                 array[i][j]= Integer.parseInt(elements[j]);
                 if(array[i][j] == 0){
                     arr_zero[j]++;
                     ch = false;
                 }  
             }
             if(ch == false){
                     op -= col;
                     count_row++;
              }
         }   

            int count=0;
            for(int i=0 ; i<arr_zero.length ; i++){
                if(arr_zero[i] != 0){
                    count = count+(row-count_row);
                }
                
            }
         

         System.out.print(op-count); 


         

        //  for(int i=0 ; i<row ; i++){

        //      String [] elements = in.readLine().trim().split(" ");

        //      for (int j=0 ;j<col ; j++){
        //          array[i][j]= Integer.parseInt(elements[j]);
                
        //      }
        //  }     
        
        //  int count =0;
        //  for(int i=0 ;i<row ;i++){
        //      for(int j=0; j<col ; j++){
        //          if(array[i][j] ==1){
        //              if(checkRow(array,i) && checkCol(array,j)){
        //                  count++;
        //              }
        //          }
        //      }
        //  } 

        //  System.out.print(count); 
        //--bruteforce technique

         
    }
}
