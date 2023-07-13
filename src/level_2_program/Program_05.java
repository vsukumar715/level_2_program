package level_2_program;
import java.util.Scanner;

public class Program_05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of row");
		int row=sc.nextInt();
		System.out.println("Enter the size of column");
		int column=sc.nextInt();
		int arr[][]=new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		//printing input
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int i=0,j=0;boolean flag=true;
		System.out.println("ZIG ZAG Output :");
		while(i<row) {
			System.out.print(arr[i][j]+" ");
			if(flag) {
				if(j==column-1) {
					i++;
					flag=false;
				}else if(i==0) {
					j++;
					flag=false;
				}else {
					i--;
					j++;
				}
				
			}else {
				if(i==row-1) {
					j++;
					flag=true;
				}else if(j==0) {
					i++;
					flag=true;
				}else {
					j--;
					i++;
				}
			}
		}
		sc.close();
		
	}
}