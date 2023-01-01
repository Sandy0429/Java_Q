static int countMultiples(int N)
    {
       //  your code here
       if( N > 100){
          return 0;
       }
       int x = (int)(100/N);
      //  System.out.println(x);
       
      //  int count = x*10;
      //  System.out.println("count: "+count);
       
      //  int remaining = N - ((N*10)*x);
      //    System.out.println("remaining"+remaining);
      //  count += (int)(remaining/N);
      //  System.out.println(count);

       return x;
    }
