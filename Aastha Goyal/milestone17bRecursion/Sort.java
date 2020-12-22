package milestone17bRecursion;

public class Sort {
	
	public static void sort(int a[],int size) {
		int maxIndex=0,t;
		if(size>1) {
			maxIndex=getmaxIndex(a,size);
			t=a[size-1];
			a[size-1]=a[maxIndex];
			a[maxIndex]=t;
			sort(a,size-1);
		}
		
	}
	
	 public static int getmaxIndex(int a[],int size){
		int max,maxIndex,i;
		max=a[0];
		maxIndex=0;
		for(i=0;i<size;i++) {
			if(max<a[i]) {
				max=a[i];
				maxIndex=i;
				
			}
		}	
		return maxIndex;
		
	}
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {100,90,45,78,56,34,89,23};
        sort(a,a.length);
        for(int i=0;i<a.length;i++) {
        	System.out.println(a[i]+" ");
        }
	}

}
