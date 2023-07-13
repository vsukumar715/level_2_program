package level_2_program;

import java.util.Scanner;

public class Program_12 {
/*
 * 12 .Sample Input-12.Print the word with odd letters – PROGRAM
   Sample Output-
    P      P
     R    R 
      O  O  
       G   
      R  R  
     A    A 
    M      M
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  word with odd letter");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<str.length();j++) {
				if((i==j)||(str.length()-i-1)==j)
					System.out.print(str.charAt(i));
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
