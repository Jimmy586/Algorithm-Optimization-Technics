
public class Main {
	/*** Using  Non Tail Recursion */

	 static double  fibonacci(int n)
	    {
	        if (n == 0) return 0;
	        else if(n==1)return 1;
	        else return fibonacci(n-1)+fibonacci(n-2);
	     /*Time Complexity: T(n) = T(n-1) + T(n-2) which is exponential.*/
	        
	    }
	 
	 /**** using  Dynamic Programming****/
	 
	 static double fibonacciDP(int n) 
	 {
		 double f[]= new double[n+2];
		 f[0]=0;
		 f[1]=1;
		 for (int i=2;i<=n;i++) {
			 f[i]=f[i-1]+f[i-2];
		 }
		 return f[n];
	 }
	 
	 
	 /*** Using TCO= Tail Call Optimization or Call recursion **/
	 
	 static double fibhelper(double n,double a, double b)//Tail Call Optimization helper function
	    {
	        if (n == 0)return a;
	        if (n==1)return b;
	     
	        return fibhelper(n - 1, b,a+b);
	    }
	     
	    static double fibonacciOpt(double n)
	    {
	        return fibhelper(n, 0,1);
	        /* Time Complexity: O(n) */
	    }
	     
	    public static void main(String[] args)
	    {
	    	long startTime = System.nanoTime();
	        System.out.println(fibonacciDP(100));//here just checked the Execution Time for DP 
	        long stopTime = System.nanoTime();
	    	System.out.println((stopTime - startTime));
	    	
	    }

}
