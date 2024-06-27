
package assignment4on26june;
import java.util.Scanner;


public class tenq {

	public static void main(String[] args) {
		System.out.println("enter the two integers :");
		Scanner a=new Scanner(System.in);
		int sp=a.nextInt();
		Scanner b=new Scanner(System.in);
		int cp=b.nextInt();
		int profit,loss;
		profit=sp-cp;
		loss=cp-sp;
		
		if(profit>0)
		{
			System.out.println("profit:"+profit);
		}
		else
		{
			System.out.println("loss:"+loss);
		}
		

	}

}
