static int  Multiply_by_recursion(int M, int N) 
    { 
  //Enter your code here
  int sum =0;
      if(N == 0)  
        sum = 0;
      else{
        sum = M + Multiply_by_recursion(M,N-1);
      }

      return sum;
    }
