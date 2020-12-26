package milestone10;

public class Class5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        class Rectangle
        {
        	int a,b;
        	public double area(int x,int y)
        	{
        		a=x;
        		b=y;
        		return a*b;
        	}
        }
        Rectangle m=new Rectangle();
        Rectangle s2=new Rectangle();
        System.out.println(m.area(3,4));
        System.out.println(s2.area(5,4));
	}

}
