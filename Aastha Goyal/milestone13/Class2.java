package milestone13;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Primary diagonal elements are: ");
        for(int i=0;i<3;i++) {
        	System.out.print(a[i][i]+",");
        }
        System.out.println("\n");
        System.out.println("Secondary diagonal elements are: ");
        System.out.print(a[0][2]+","+a[1][1]+","+a[2][0]);
        
	}

}
