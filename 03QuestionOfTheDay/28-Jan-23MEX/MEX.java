import java.io.*;
import java.util.*;

class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    
    int x =0;
    for(int i=0;i<n;i++){
      if(arr[i] == x){
        x++;
      }
      if(arr[i] > x){
        break;
      }
    }
    
    System.out.println(x);
  }
}
