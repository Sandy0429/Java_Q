public class SubArraySumEqualsK{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int sum = sc.nextInt();

    int currSum=0;
    int start =0;
    int end =-1;
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0; i<n; i++){
      currSum += arr[i];

      if(currSum - sum == 0){
        start=0;
        end=i;
        break;
      }

      if(map.containsKey(currSum-sum)){
        start = map.get(currSum-sum)+1;
        end=i;
        break;
      }
      map.put(currSum,i);
      
    }

    if(end == -1){
      System.out.println("Element not found");
    }
    else{
      System.out.println(start+" "+end);
    }
    //this code will tell start and end index
    sc.close();
  }
}
