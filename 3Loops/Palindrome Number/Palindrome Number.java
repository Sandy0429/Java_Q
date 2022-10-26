static void isPalindrome(int N)
	{
	   // Your code here
	   int n=0, j=N;
	   while(j!=0)
	   {
		   int q = j%10;
		   n = n*10 +q;
		   j=j/10;
	   }

	   if(n==N)
	   	System.out.print("True");
		else
		System.out.print("False");
	}
