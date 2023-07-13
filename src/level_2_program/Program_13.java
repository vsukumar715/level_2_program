package level_2_program;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Sample Input – Alternate Sorting 
     Input: {1, 2, 3, 4, 5, 6, 7}
     output: {7, 1, 6, 2, 5, 3, 4}
 */
public class Program_13 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter the size of array");
	int size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter the array element");
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Input  : "+Arrays.toString(arr));
	Arrays.sort(arr);
	for(int i=0;i<size-1;i=i+2) {
		int temp=arr[size-1];
		for(int j=size-1;j>i;j--) {
			arr[j]=arr[j-1];
		}
		arr[i]=temp;
	}
	
	System.out.println("Output : "+Arrays.toString(arr));
	sc.close();

	}

}
