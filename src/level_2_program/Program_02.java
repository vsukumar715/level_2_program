package level_2_program;

import java.util.Scanner;

/*
 * 2. Given a Boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell mat[i][j] is 1 then make its
 *  adjacent cells as 0.
 */
public class Program_02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the matrix size of row");
		int row =sc.nextInt();
		System.out.println("Enter the matrix size of coloum");
		int coloum=sc.nextInt();
		
		int arr[][]=new int[row][coloum];
		int temp=0;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<coloum;j++) {
				if(temp++%2==0)
					arr[i][j]=1;
				else
					arr[i][j]=0;
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<coloum;j++) 
					System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		sc.close();

	}

}
