// Function to insert element into list
    public static void insert(ArrayList<Integer> list, int x)
    {
       // Your code here
       list.add(x);
    }
    
    // Function to sort list in Increasing order
    public static void IncOrder(ArrayList<Integer> list)
    {
        // Your code here
        Collections.sort(list);
    }
    
    // Function to search element in the lise
    // val : element to be searched
    public static void Search(ArrayList<Integer> list, int val)
    {
        // Your code here
        System.out.print(list.indexOf(val)+" ");
        // int get=0;
        // for(int i : list){
        //     if(i == val){
        //         System.out.print(list.indexOf(i));
        //         get=1;
        //         break;
        //     }
        // }
        // if(get == 0)
        //     System.out.print(-1);

    }
    
    // Function to sort list in decreasing order
    public static void DecOrder(ArrayList<Integer> list)
    {
       // Your code here
       Collections.sort(list,Collections.reverseOrder());
    }
