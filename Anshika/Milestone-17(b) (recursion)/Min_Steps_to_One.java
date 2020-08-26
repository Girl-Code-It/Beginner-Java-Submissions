//https://codezen.codingninjas.com/practice/468/111/min-steps-to-one




public class Min_Steps_to_One
 {
	
	public static int countStepsTo1(int n){
        
        if (n==1)
            return 0;
        else
        {
            int a=n, b=n, c=n;
             if (n%3==0)
            a=1+countStepsTo1(n/3);
            if (n%2==0)
                b=1+countStepsTo1(n/2);
            c=1+countStepsTo1(n-1);
            
           return Math.min(a,Math.min(b,c));
            
        }
		
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
	 */
	
	}
	
}