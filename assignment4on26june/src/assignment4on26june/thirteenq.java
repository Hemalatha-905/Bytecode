package assignment4on26june;

import java.util.Scanner;

public class thirteenq {

	public static void main(String[] args) {
		System.out.println("enter the values:");
		Scanner a=new Scanner(System.in);
		int firstside=a.nextInt();
		Scanner b=new Scanner(System.in);
		int secondside=b.nextInt();
		Scanner c=new Scanner(System.in);
		int thirdside=c.nextInt();
		if(firstside==secondside && secondside==thirdside)
		{
			System.out.println("regular");
		}
		else if (firstside==secondside || secondside==thirdside)
		{
			System.out.println("symmetric");
		
		}
		else
		{
			System.out.println("Irregular");
		}
	}

}
