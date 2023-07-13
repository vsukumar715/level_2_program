package level_2_program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program_08 {
/*
 * 8.Print all possible subsets of the given array whose sum equal to given N.
     example: Input  : {1, 2, 3, 4, 5} N=6 
              Output : {1, 2, 3}, {1, 5}, {2, 4}
 */
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter the array element");
    for(int i=0;i<size;i++) {
    	arr[i]=sc.nextInt();
    }
    System.out.println("Enter the sum value");
    int sum=sc.nextInt();
    System.out.println("Input  :"+Arrays.toString(arr));
    List<List<Integer>> subset=equalSumOfSubsets(arr,size,sum);
    
    for(int i=0;i<subset.size();i++) {
    	System.out.println(subset.get(i));
    }
    sc.close();
	}
	private static List<List<Integer>> equalSumOfSubsets(int[] arr,int size,int sum){
		
		List<List<Integer>> subsets=new ArrayList<>();
		
		for(int i=0;i<Math.pow(2, size);i++) {
			
			List<Integer> list=new ArrayList<>();
			int temp=0;
			for(int j=0;j<size;j++) {
				if( (i&(1<<j)) !=0) 
					list.add(arr[j]);
			}
			for(int k=0;k<list.size();k++) {
				temp+=list.get(k);
			}
			if(temp==sum) {
				subsets.add(list);
			}
		}
		return subsets;
		
	}
}
