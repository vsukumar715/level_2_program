package level_2_program;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 1. Given an array of integers, replace every element with the next greatest element (greatest element on the right side) in 
 * the array. Since there is no element next to the last element, replace it with -1. For example, if the array is 
 * {16, 17, 4, 3, 5, 2}, then it should be modified to {17, 5, 5, 5, 2, -1}.
 */
public class Program_01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int size=sc.nextInt();
		int arr[]=new int [size];
		System.out.println("Enter the array element");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Input  : "+Arrays.toString(arr));
		for(int i=1;i<size;i++) {
			int max=arr[i];
			for(int j=i+1;j<size;j++) {
				if(arr[j]>max)
					max=arr[j];
			}
			arr[i-1]=max;
		}
		arr[size-1]=-1;
		System.out.println("Output : "+Arrays.toString(arr));
		sc.close();
      
	}

}
