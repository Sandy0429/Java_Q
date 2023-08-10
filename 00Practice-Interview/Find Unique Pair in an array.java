public class Main {
    public static void main(String[] args) {
        int [] arr = {1,3,41,-2,2,5,0,7,3,3};
        int sum = 6;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        
       
        for(Map.Entry<Integer,Integer> it: map.entrySet()){
            int i = it.getKey();
          //If the twice of the number present there is the required sum
            if(2*i == sum){
              //then we'll check if it's frequency is greater than 1 then we'll print the value 
              //remember as we have to print it once so that's why using this logic
                if(map.get(i) > 1){
                    System.out.println(i+" "+ i);
                }
            }
              //Otherwise we'll check of any other number is present there with the mention sum
              //If the sum is present there then we'll decrease the frequency of both the occuring element so that we don't repeat it in answer
            else{
                if(map.containsKey(sum-i) && map.get(sum-i) != 0){
                    System.out.println(i+" "+(sum-i));                    
                    map.put((sum-i),map.get(sum-i)-1);
                    map.put((i), map.get(i)-1);
                }                

            }
        }
              
        
    }
}

/*
current;
temp = sum- current;
sum =6
int [] arr = {1,3,41,-2,2,5,0,7,3,3};
        int sum = 6;
  Op:   1 5
        3 3
*/
