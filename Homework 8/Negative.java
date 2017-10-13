
/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Sam Aponte
   Date Due:  10/13/2017
 ******************************************************************************/
 import java.util.Scanner;
public class Negative																											

{
	public static void main(String[] args)
	{
	   
		Scanner keyboard;
		keyboard = new Scanner(System.in);
		int num;
		int sum=0;
		int large=0;
		
		System.out.println(" Give me a negative number.");
		num = keyboard.nextInt();
		
		while (num > 0)
		{
			System.out.println( " Nope try Again.");
			num = keyboard.nextInt();
			sum += num;
			
			if (large < num)
			{
				large = num;
			}
		}
		System.out.printf(" %d is a negative number!!\n",num);
		System.out.printf( "The sum of all your numbers was %d\n",sum );
		System.out.printf( "the largest number you gave was %d\n",large );
	}
}