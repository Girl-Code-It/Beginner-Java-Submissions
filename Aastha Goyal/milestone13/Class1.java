package milestone13;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a= {1,2,3,4,5};
        int t=a[4];
        for(int i=4;i<=1;i--) {
        	a[i]=a[i-1];
        }
        a[0]=t;
        for(int i=0;i<=4;i++) {
        	System.out.print(a[i]);
        }
	}

}
