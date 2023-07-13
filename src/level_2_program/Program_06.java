package level_2_program;


import java.util.Scanner;

public class Program_06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String input=sc.nextLine();
		char ch[]=input.toCharArray();
		for(int i=1;i<ch.length;i++) {
			char temp=ch[i];
			for(int j=0;j<i;j++) {
				
				if(temp==ch[j])
				{
					if(temp=='Z') {
						ch[i]='A';
					} 
					else if(temp=='z') {
						ch[i]='a';
						
					}
					else if(temp=='9') {
						ch[i]='0';
						
					}else {
						ch[i]=++temp;
					}
				}
			}
		
		}
		String s=new String(ch);
		System.out.println(s);
		sc.close();
	}

}
