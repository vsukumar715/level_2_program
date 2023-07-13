package level_2_program;

import java.util.Scanner;
/*
 * 7. Print whether the version is upgraded, downgraded or not changed according to the input given.
      example: Input : Version1 4.8.2 ,Version2 4.8.4 Output: upgraded, 
               Input : Version1 4.0.2 ,Version2 4.0.1 Output: downgraded;
 */
public class Program_07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the version 1");
		String version1=sc.nextLine();
		System.out.println("Enter the version 2");
		String version2=sc.nextLine();
		int maxLength=Math.max(version1.length(), version2.length());
		int arr1[]=new int[maxLength];
		int arr2[]=new int[maxLength];
		for(int i=0;i<version1.length();i++) {
			char c1=version1.charAt(i);
			if(c1!='.') {
				arr1[i]=Integer.valueOf(c1);	
			}	
		}
		for(int i=0;i<version2.length();i++) {
			char c2=version2.charAt(i);
			if(c2!='.') {
				arr2[i]=Integer.valueOf(c2);
			}
		}
		int result=-1;
		for(int i=0;i<maxLength;i++) {
		
			if(arr1[i]==arr2[i]) {
				result=0;
			}else if(arr1[i]>arr2[i]) {
				result=-1;
			}else if(arr1[i]<arr2[i]) {
				result=1;
			}
		}
		if(result==1) {
			System.out.println("Upgraded");
			
		}else if(result==0){
			System.out.println("same version");
		}else {
			System.out.println("Downgraded");
		}
		sc.close();
		
	}

}
