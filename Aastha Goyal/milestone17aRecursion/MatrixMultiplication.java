package milestone17aRecursion;

public class MatrixMultiplication {
       static int i=0,j=0,k=0;  
	static void MulMatrix(int row1,int col1, int A[][],int B[][],int row2, int col2, int C[][]) {
		if(i>=row1)
			return;
		if(j<col2) {
			if(k<col1) {
				C[i][j]+=A[i][k]*B[k][j];
				k++;
				MulMatrix(row1,col1,A,B,row2,col2,C);
			}
			k=0;
			j++;
			MulMatrix(row1,col1,A,B,row2,col2,C);
		}
		j=0;i++;
		MulMatrix(row1,col1,A,B,row2,col2,C);
		
	}
	
	static void Checker(int row1,int col1, int A[][],int B[][],int row2, int col2) {
		if(row2!=col1) {
			System.out.println("not possible");
			return;
		}
		else
		{
			int C[][]=new int[100][100];
			MulMatrix(row1,col1,A,B,row2,col2,C);
			for(int i=0;i<row1;i++) {
				for(int j=0;j<col2;j++) {
					System.out.print(C[i][j]+" ");
					
					
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int row1=3,col1=3,row2=3,col2=3;
        int A[][]= { {1,2,3},
                     {4,5,6},
                     {7,8,9} };
        int B[][]= { {1,2,3},
                     {4,5,6},
                     {7,8,9} };
       
        Checker(row1,col1,A,B,row2,col2);
	}

}
