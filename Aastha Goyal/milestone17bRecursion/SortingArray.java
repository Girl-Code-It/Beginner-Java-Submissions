package milestone17bRecursion;

public class SortingArray {
     
	 static void sort(int a[]) {
		if(a.length==1)
			return ;
		
		
			int temp=a[a.length-1];
			a[a.length]=(Integer)null;
			sort(a);
			insert(a,temp);
	}
	
	static void insert(int a[],int temp) {
		if(a.length==0 || a[a.length-1]<=temp)
		{
			a[a.length-1]=temp;
			return;
			
		}
		
		int val=a[a.length-1];
		insert(a,temp);
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {2,4,7,8,3,5,9};
        sort(a);
        System.out.println(a);
	}

}
