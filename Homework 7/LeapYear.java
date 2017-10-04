
/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Sam Aponte
   Date Due:  10/4/2017
 ******************************************************************************/
 import java.util.Scanner;
public class LeapYear
{
	public static void main(String[] args)
	{
	   
		Scanner keyboard;
		keyboard = new Scanner(System.in);
		int a;
		



		System.out.print("GIve me a leap year???");
		a = keyboard.nextInt();
		if (a % 4 == 0 )
		{
			if ( a % 100 == 0 )
			{
				if ( a % 400 == 0 )
				{
					System.out.println( " AYYYYY! ");
				}
				else
				{
				  	System.out.print( " NAHH BRUHH!");
				}
			}
			else 
			{
				  System.out.print( " YAAA BRUHHH!");
			}
        }
        else
        {
            System.out.print( " NAHH BRUHH!");
        }
    }    
}