import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
        // Your code here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String moves = in.readLine().trim();
        int []countOfMoves = new int[4];// 0=L ;1=R; 2=U; 3=D;

        for(int i=0; i<moves.length() ; i++){
            if(moves.charAt(i) == 'L'){
                countOfMoves[0]++;
            }
            else if(moves.charAt(i) == 'R'){
                countOfMoves[1]++;
            }
            else if(moves.charAt(i) == 'U'){
                countOfMoves[2]++;
            }
            else if(moves.charAt(i) == 'D'){
                countOfMoves[3]++;
            }
        }

        if(countOfMoves[0]==countOfMoves[1] && countOfMoves[2] == countOfMoves[3]){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}
