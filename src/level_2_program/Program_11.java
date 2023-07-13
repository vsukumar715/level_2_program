package level_2_program;

import java.util.Scanner;

public class Program_11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String temp1="";String temp2="";
		for(int i=0;i<str.length();i++) {
			if(i%2==0) {
				temp2+=str.charAt(i);
			}else {
				temp1+=str.charAt(i);
			}
		}
		System.out.println(temp2+" "+temp1);
		sc.close();
	}
	

}
