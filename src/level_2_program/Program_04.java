package level_2_program;

import java.util.Random;
import java.util.Scanner;
/*
   4. In MS-Paint, when we take the brush to a pixel and click, the color of the region of that pixel is replaced with a new
      selected color. Following is the problem statement to do this task.
      Given a 2D screen, location of a pixel in the screen and a color, replace color of the given pixel and all adjacent same
      colored pixels with the given color.
 */
public class Program_04 {
    private static int generateInt() {
    	int num=-1;
    	Random random=new Random();
    	num=random.nextInt(3);
    	return num;
    }
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the screen size of width");
		int width=sc.nextInt();
		System.out.println("Enter the screen size of height");
		int height=sc.nextInt();
		int screen[][]=new int[width][height];
		//creating screen display
		for(int i=0;i<width;i++) {
			for(int j=0;j<height;j++) {
				screen[i][j]=generateInt();
			}
		}
		//printing the screen
		
		for(int i=0;i<width;i++) {
			for(int j=0;j<height;j++) {
			System.out.print(screen[i][j]+" "); 
			}
			System.out.println();
		}
		System.out.println("Enter the replace color location of row size");
		int selectedRow=sc.nextInt();
		System.out.println("Enter the replace color location of coloum size");
		int selectedColoum=sc.nextInt();
		int old_color=screen[selectedRow][selectedColoum];
		System.out.println("Enter the new color(integer value)");
		int new_color=sc.nextInt();
		//modify the screen
		for(int i=0;i<width;i++) {
			for(int j=0;j<height;j++) {
				if(screen[i][j]==old_color)
					screen[i][j]=new_color;
				System.out.printf("%2d ",screen[i][j]);
			}
			System.out.println();
		}
		
	   sc.close();
	}

}
