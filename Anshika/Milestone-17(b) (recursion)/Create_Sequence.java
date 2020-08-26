//https://codezen.codingninjas.com/practice/468/714/create-sequence


public class Create_Sequence
{
	
	public static void printSequence(int range){
        
        print (range);
        return;
		//Write your code here
	}
    
    static void print (int n)
    {
        if (n==2)
        {
            System.out.println ("2");
            return;
        }
        else
        {
            if (check(n))
            {
                System.out.println (n);
            }
            print (n-1);
            return;
        }
    }
    
    static boolean check (int n)
    {
        if(n==0)
            return true;
        else
        {
            int d=n%10;
            if (d!=2 && d!=5)
                return false;
            else
                return check(n/10);
        }
    }
}