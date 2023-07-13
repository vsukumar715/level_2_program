package level_2_program;

import java.util.Arrays;
import java.util.Scanner;
/*
 *42. Given an array of integers of size n. Convert the array in such a way that if next valid number is same as current number, double its 
 *    value and replace the next number with 0. After the modification, rearrange the array such that all 0’s are shifted to the end.
      Input : arr[] = {2, 2, 0, 4, 0, 8}
      Output : 4 4 8 0 0 0
      Input : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}
      Output : 4 2 12 8 0 0 0 0 0 0
 */
public class Program_42 {

	public static void main(String[] args) {//[4, 0, 0, 4, 0, 8]
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=scan.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array element");
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Input  : "+Arrays.toString(arr));
		int pos=0;
		for(int i=1; i<size;i++) {
			if(pos<size) {
				if(arr[pos]==arr[i]) {
					arr[pos]=arr[i]*2;
					arr[i]=0;
				}
			}
			pos++;
		}
		for(int i=0;i<size;i++) {
			if(arr[i]==0) {
				for(int j=i+1;j<size;j++) {
					if(arr[j]!=0) {
						arr[i]=arr[j];
						arr[j]=0;
						break;
					}
				}
			}
		}
		System.out.println("Output : "+Arrays.toString(arr));
		scan.close();
	}

}
