
/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Sam Aponte
   Date Due:  9/15/2017
 ******************************************************************************/
 import java.util.Scanner;
public class PrintGreeting 
{
	public static void main(String[] args)
	{
	    Scanner Samuel;
		String name;
		Samuel = new Scanner(System.in);
		System.out.println("Hey, Whats your name?");
		name=Samuel.nextLine();
		System.out.println("Nice to meet you " + name );
	}
}
  