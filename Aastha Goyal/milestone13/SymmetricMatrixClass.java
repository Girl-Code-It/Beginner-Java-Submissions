package milestone13;

public class SymmetricMatrixClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] mat= {{1,2,3},{4,5,6},{7,8,9}};
        int c=0,r=0;
       for(r=0;r<3;r++) {
    	   for(c=0;c<r;c++) {
    		   if(mat[r][c]!=mat[c][r])
    		   break;
    	   }
    	   if(c<r)
    		   break;
       }
       if(c==r)
    	   System.out.println("Matrix is Symmetric");
       else
    	   System.out.println("Matrix is not Symmetric");
	}

}
