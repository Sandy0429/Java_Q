public class Main {
    public static void main(String[] args) {
        int [] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        
        int start =0;
        int end = arr.length-1;
        while(start < end){
            while(arr[start] == 0){
                start++;
            }
            while(arr[end] == 1){
                end--;
            }
            if(start < end){
              // System.out.println("Start "+start+"End "+end);
            if(arr[start] == 1 && arr[end] == 0){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end]= temp;  
                start++;
                    end--;
            }  
            }
            
                        
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

/*
In the aabove code we have use the two pointer method to sort the elements of zeroes and ones

op:
0
0
0
0
0
1
1
1
1
1

*/
