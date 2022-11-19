import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
                      // Your code here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String [] rowCol = in.readLine().trim().split(" ");

        // int row = Integer.parseInt(rowCol[0]);
        // int col = Integer.parseInt(rowCol[1]);
        // char [][] array = new char [row][col];
        // for(int i=0; i<row ; i++){
        //     String  elements = in.readLine();//.trim().split(" ");            
        //     for(int j=0; j<col ; j++){
        //         array[i][j] = elements.charAt(j*2);                
        //     }            
        // }
        // for(int i=0; i<row ; i++){
        //     for(int j=0 ; j<col ;j++){
                
        //     }
        // }
        int n = Integer.parseInt(rowCol[0]);
        int m = Integer.parseInt(rowCol[1]);
        char [][] g = new char [n][m];
        for(int i=0; i<n ; i++){
            String  elements = in.readLine();//.trim().split(" ");            
            for(int j=0; j<m ; j++){
                g[i][j] = elements.charAt(j*2);                
            }            
        }


        	int ans = 0;
    		for(int i = 0; i < n; i++) {
    			for(int j = 0 ; j < m; j++) {
    				if(g[i][j]=='s') {
    					if(j<=m-4) {
    						if(g[i][j+1]=='a' && g[i][j+2]=='b' && g[i][j+3]=='a') ans++;
    					}
    					if(i<=n-4) {
    						if(g[i+1][j]=='a' && g[i+2][j]=='b' && g[i+3][j]=='a') ans++;
    					}
    					if(i<=n-4 && j<=m-4) {
    						if(g[i+1][j+1]=='a' && g[i+2][j+2]=='b' && g[i+3][j+3]=='a') ans++;
    					}
    					if(i>=3 && j<=m-4) {
    						if(g[i-1][j+1]=='a' && g[i-2][j+2]=='b' && g[i-3][j+3]=='a') ans++;
    					}
    				}
    			}
    		}
    		System.out.print(ans);


        
    }
}
