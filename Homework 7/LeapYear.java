
/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Sam Aponte
   Date Due:  9/15/2017
 ******************************************************************************/
 import java.util.Scanner;
public class LeapYear
{
	public static void main(String[] args)
	{
	   
		Scanner samuel;
		samuel = new Scanner(System.in);
		int a;
		int b;



		System.out.print("GIve me a leap year???");
		a = samuel.nextInt();
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
   
