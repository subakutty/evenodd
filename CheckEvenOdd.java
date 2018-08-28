# evenodd
import java.util.Scanner;


class CheckEvenOdd

{

 	 public static void main(String args[])
 
 	{
    
		int num;
    
		System.out.println("Enter an Integer number:");

    		Scanner input = new Scanner(System.in);
   
 		num = input.nextInt();
 
   		if ( num % 2 == 0 )
		{
        		System.out.println("Entered number is even");
 
		}  
  		if(num%2==1)

		{
        		System.out.println("Entered number is odd");
  
		}  
		if(num%2!=0&&num%2!=1)
		{
        		System.out.println("Entered number is invalid");

		}
	}
}
