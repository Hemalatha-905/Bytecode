package assignment4on26june;
import java.util.Scanner;
public class fourteenq {

	public static void main(String[] args) {
		System.out.println("enter the values:");
		Scanner a=new Scanner(System.in);
		int firstnumber=a.nextInt();
		Scanner b=new Scanner(System.in);
		int secondnumber=a.nextInt();
		Scanner c=new Scanner(System.in);
		int thirdnumber=a.nextInt();
		if(firstnumber>secondnumber && firstnumber>thirdnumber)
		{
			System.out.println("greatest number:"+firstnumber);
			
		}
		else if(secondnumber>firstnumber && secondnumber>thirdnumber) {
			System.out.println("greatest number:"+secondnumber);
		}
		else
		{
			System.out.println("greatest number:"+thirdnumber);
		}
			

	}

}
