package level_2_program;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 3. Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of 
 *    elements at higher indexes. For example, in an array A:
 */
public class Program_03 {
    
	public static void main(String[] args) {
		boolean result=false;int index =-1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array element");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Input  :"+Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
		   int left=0;int right=0;
		   for(int j=0;j<i;j++) {
			   left+=arr[j];
		   }
		   for(int k=i+1;k<arr.length;k++) {
			   right+=arr[k];
		   }
		   if(right==left) {
			   index=i;
			   break;
		   }
		}
		if(result)
			System.out.println("Equilibrium index is "+index);
		else
			System.out.println("Equilibrium index is "+index);
	   sc.close();
	}
}
