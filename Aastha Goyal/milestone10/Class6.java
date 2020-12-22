package milestone10;

public class Class6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        class Area
        {
        	int a,b;
        	public void setDim(int x,int y) 
        	{
        		a=x;b=y;
        	}
        	public double getArea()
        	{
        		return a*b;
        	}
        }
        Area s=new Area();
        s.setDim(3,4);
        System.out.println(s.getArea());
	}

}
