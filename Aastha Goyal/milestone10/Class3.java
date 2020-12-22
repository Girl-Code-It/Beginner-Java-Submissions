package milestone10;

public class Class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        class Triangle
        {
        	int l,b,h;
        	public double getArea()
        	{
        		double s=(l+b+h)/2.0;
        		return Math.pow((s*(s-l)*(s-b)*(s-h)),.5);
        	}
        	public double getPerimeter()
        	{
        		return (l+b+h)/2.0;
        	}
        	
        }
        Triangle t=new Triangle();
        t.l=3;
        t.b=4;
        t.h=5;
        System.out.println(t.getArea());
        System.out.println(t.getPerimeter());
	}

}
