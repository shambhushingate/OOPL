import java.util.Scanner;

public class Exception_Handling {
	public static void main(String[] arr) {
		int num1, num2;
		int[] n = {1,2,3,4,5};
		
		Scanner sc = new Scanner(System.in);
		try {
    		    // try block
    			System.out.println("Enter two numbers: ");
    			num1 = Integer.parseInt(sc.next());
    			num2 = Integer.parseInt(sc.next());
    			
    			int c = num1 / num2;
    			System.out.println("Division is : " + c);
    			
    			System.out.println("Enter index of element you want - ");
    			int ind = sc.nextInt();
    			System.out.println("Element is : " + n[ind]);
		}
		//catch blocks  after exception occur
		catch(NumberFormatException num) 
		{
		    //method to check NumberFormatException
			System.err.println("Numbers You have Enter are not Integers :" + num.getMessage());
		}
		
		catch(ArrayIndexOutOfBoundsException aindex) 
		{
		    //method to check ArrayIndexOutOfBoundsException
			System.err.println("Invalid Index : " + aindex.getMessage());
		}
		
		catch(ArithmeticException ari) 
		{
		    //method to check arthmaticException
			System.err.println("Cannot Divide by Zero :" + ari.getMessage());
		}
		
		finally {
			System.err.println("Out of try-catch blocks");
		}
		sc.close();
	}
}
