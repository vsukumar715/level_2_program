package level_2_program;

import java.util.Scanner;

/*
 * 10. calculate Maximum number of chocolates can eat and Number of wrappers left in hand.
       Money: Total money one has to spend.
       Price: price per chocolate.
       wrappers: minimum number of wrappers for exchange choco: number of chocolate for wrappers.
       Max visit: Maximum number of times one can visit the shop.(if zero consider it infinite)
       
       example: input  : Money:40 Price:1 wrappers:3 choco:1 Max visit:1 
                Output : total chocolate can eat: 53 wrappers left in hand:14
 */
public class Program_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the money spend on chocolate");
		int money=sc.nextInt();
		System.out.println("Enter the price per chocolate");
		int price=sc.nextInt();
		System.out.println("Enter the minimum no of wrappes for exchange");
		int wrappers=sc.nextInt();
		System.out.println("Enter the number of chocolate for wrappers");
		int chocos=sc.nextInt();
		System.out.println("Enter the maxinum number of times one can visit the shop");
		int max_visit=sc.nextInt();
		
		int chocolates=money/price;
		int freeWrappers=chocolates;
		int tempChocos=0;
		int balanceWrappers=0;
		for(int i=1;i<=max_visit;i++) {
			tempChocos=(freeWrappers/wrappers)*chocos;
		    chocolates+=tempChocos;
		    balanceWrappers+=freeWrappers%wrappers;
		    freeWrappers=tempChocos;
		}
		balanceWrappers+=freeWrappers;
        System.out.println("Total chocolate can eat : "+chocolates);
        System.out.println("Wrapppers left in hand  : "+balanceWrappers);

		sc.close();
	}

}
