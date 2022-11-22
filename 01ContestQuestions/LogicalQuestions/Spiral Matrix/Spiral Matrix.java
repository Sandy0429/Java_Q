import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    
    public static void main (String[] args)throws IOException {
                      // Your code here
                      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // String [] rowCol = in.readLine().trim().split(" ");
        // System.out.print(rowCol.length);
        // int row = Integer.parseInt(rowCol[0]);
        // int col = Integer.parseInt(rowCol[0]);
        // int [][] arr = new int[row][col];
        Scanner sc =new Scanner(System.in);        
        int row = sc.nextInt();
        int col = sc.nextInt();      
        int [][] arr = new int[row][col];

        if(row <= 0 || col<=0){
            System.exit(0);
        }

        //assigning value to array
        for(int i=0 ; i<row ; i++){           
            for(int j =0 ; j<col ; j++){               
                arr[i][j] = sc.nextInt();                
            }
        }

        //assigning value to array
        // for(int i=0 ; i<row ; i++){
        //     String [] elements = in.readLine().trim().split(" ");
        //      for(int j =0 ; j<col ; j++){
        //         arr[i][j] = Integer.parseInt(elements[j]);       
        //         System.out.println(arr[i][j]);         
        //     }
        // }
       
       

        int row_start = 0, row_end=row-1;
        int col_start = 0, col_end=col-1;

        while(row_start<=row_end && col_start<=col_end){
            //top
            for(int i=col_start ; i<= col_end ; i++){
                System.out.print(arr[row_start][i]+" ");
                //System.out.println("loop1 ");
            }
            row_start++;

            //right
            for(int j= row_start ; j<=row_end ; j++){
                System.out.print(arr[j][col_end]+" ");
               // System.out.println("loop2 ");
            }
            col_end--;

                if(row_start > row_end || col_start > col_end ){
                    break;
                }
            //bottom
            for(int i= col_end ; i>=col_start; i--){
                System.out.print(arr[row_end][i]+" ");
               // System.out.println("loop3 ");
            }
            row_end--;

            //left
            for(int j = row_end ; j>=row_start; j-- ){
                System.out.print(arr[j][col_start]+" ");
                //System.out.println("loop4 ");
            }            
            col_start++;
            
            
        }
    }
}

/*
Getting error for input 
3 1
1 2 3

issue with BufferedReader it was taking input at once so 
next row was showing index out of bound error
*/
