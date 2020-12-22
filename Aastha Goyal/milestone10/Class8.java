package milestone10;

public class Class8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       class Average
       {
    	   int a,b,c;
    	   public double toCalculate()
    	   {
    		   return (a+b+c)/3;
    	   }
       }
       Average s= new Average();
       s.a=30;
       s.b=10;
       s.c=20;
       System.out.println("Average is: "+s.toCalculate());
	}

}
