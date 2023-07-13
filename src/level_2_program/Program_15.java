package level_2_program;

import java.util.Scanner;

public class Program_15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the initial position of x");
		int x=sc.nextInt();
		System.out.println("Enter the initial position of y");
		int y=sc.nextInt();
		System.out.println("Enter the no of movement");
		int movement=sc.nextInt();
		char arr[]=new char[movement];
		System.out.println("Enter  the sequence of movement");
		for(int i=0;i<movement;i++) {
			arr[i]=sc.next().charAt(0);
		}
	
		for(int i=0;i<movement;i++) {
			char ch=arr[i];
			if(ch=='U') {
				y++;
			}else if(ch=='D') {
				y--;
			}
			else if(ch=='L') {
				x--;
			}
			else if(ch=='R') {
				x++;
			}
		}
		System.out.println("(x,y)  : ("+x+","+y+")");
		

	}

}
