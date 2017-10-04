
/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Sam Aponte
   Date Due:  9/15/2017
 ******************************************************************************/
 import java.util.Scanner;
public class GuessingGame
{
	public static void main(String[] args)
	{
	   
		Scanner samuel;
		samuel = new Scanner(System.in);
		int a;
		int b;



		System.out.print("Im thinking of a number between 1 and 10,000. Can you Guess???");
		a = samuel.nextInt();
		if (a < 5101 )
		{
				System.out.print("Toooooo Low there buddy >:)");
        }
        if ( a > 5101 )
        {
            System.out.print(" So close just a little to high!");
        }if ( a ==  5101)
        {
            System.out.print("YOUUUUU GOTTT ITTTTTT!!!");
        }
    }    
}
   
