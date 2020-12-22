package milestone10;

public class Class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 class Triangle
	        {
	        	int l,b,h;
	            public double getArea(int x,int y,int z)
	        	{
	            	l=x;
	            	b=y;
	            	h=z;
	        		double s=(l+b+h)/2.0;
	        		return Math.pow((s*(s-l)*(s-b)*(s-h)),.5);
	        		
	        	}
	        	public double getPerimeter(int x,int y,int z)
	        	{
	        		l=x;
	            	b=y;
	            	h=z;
	        		return (l+b+h)/2.0;
	        	}
	        	
	        }
	        Triangle t=new Triangle();
	        
	        System.out.println(t.getArea(3,4,5));
	        System.out.println(t.getPerimeter(3,4,5));
	}

}
