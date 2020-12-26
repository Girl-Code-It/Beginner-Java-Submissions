package milestone17bRecursion;

public class RemoveDuplicates {
	
	static void RD(char[] c,char[] t,int i,int j) {
		if(i<c.length) {
		if(i==0) {
			t[0]=c[0];
			i++;
			j++;
			
		}
		else
		{
			if(c[i]==c[i-1]) {
				i++;
				
			}
			else
			{
				t[j]=c[i];
				i++;
				j++;
				
			}
		}
		RD(c,t,i,j);
		
		
		}
		
	}
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="aaabbsdaae";
        char[] c=new char[s.length()];
        char[] t=new char[s.length()];
        for(int i=0;i<s.length();i++) {
        	c[i]=s.charAt(i);
        }
        int i=0,j=0;
        RD(c,t,i,j);
        for(int k=0;k<s.length();k++) {
        System.out.print(t[k]);
       
        }
	}

}
