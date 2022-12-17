static int smallerElements(int a[], int n, int k){
        //Enter your code here
        int start =0;
        int end = n-1;
        while(start <= end){
                int mid = start+(end-start)/2;

                if(a[mid] == k){
                        return mid+1;
                }

                if(a[mid] < k){
                        start = mid +1;
                }
                else{
                        end = mid -1;
                }
        }

        return start;
}
