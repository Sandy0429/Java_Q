static char Race(int A,int B,int C){
//Enter your code here
   char max = (Math.abs(C-A) < Math.abs(B-C))? 'N':(Math.abs(C-A) > Math.abs(B-C))?'S':'D';
   return max;
}
