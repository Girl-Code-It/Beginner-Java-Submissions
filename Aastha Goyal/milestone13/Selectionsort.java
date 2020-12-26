package milestone13;

public class Selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,3,1,45,15};
		int min;
        for(int i=0;i<a.length;i++) {
        	for(int j=0;j<a.length;j++) {
        		if(a[i]>a[j]) {
        			min=a[i];
        			a[i]=a[j];
        			a[j]=min;
        		}
        	}
        }
        for(int i=0;i<a.length;i++) {
        	System.out.println(a[i]);
        }
	}

}
