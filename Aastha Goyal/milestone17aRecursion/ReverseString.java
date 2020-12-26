package milestone17aRecursion;

public class ReverseString {
	
	static void ReverseString(String c) {
		if(c==null || c.length()<=1)
			System.out.print(c);
		else {
			System.out.print(c.charAt(c.length()-1));
		ReverseString(c.substring(0,c.length()-1));
		}	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString obj=new ReverseString();
		String c="Veeam";
		//int n=c.length();
		int i=0;
		ReverseString(c);
		//System.out.print(s);
          
	}

}
