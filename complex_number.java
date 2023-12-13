import java.util.Scanner;
class Complex_No
 {
	int real,img;
	public Complex_No()
	{   
	    //default constructor
		real=0;
		img=0;
	}
	public Complex_No(int a ,int b)
	{   
	    //parametrized constructor
		real=a;
		img=b;
	} 
	
	public void Display(Complex_No C1,Complex_No C2)
	{   
	    // Method to Display two complex numbers
		System.out.println("First Complex Numbers =("+C1.real+")+("+C1.img+")i");
		System.out.println("Second Complex Numbers =("+C2.real+")+("+C2.img+")i");
		
	}
	
	public void AddNum(Complex_No C1,Complex_No C2)
	{   
	    // Method to add two complex numbers
		int real,img;
		real=(C1.real+C2.real);
		img=(C1.img+C2.img);
		System.out.println("Addition of Complex Numbers =("+real+")+("+img+")i");
	}
	public void subNum(Complex_No C1,Complex_No C2)
	{
		// Method to subtract two complex numbers
		int real,img;
		real=(C1.real-C2.real);
		img=(C1.img-C2.img);
		System.out.println("Subtraction of Complex Numbers =("+real+")+("+img+")i");
	}
	public void mulNum(Complex_No C1,Complex_No C2)
	{
		// Method to multiply two complex numbers
		int real,img;
		real=(C1.real*C2.real);
		img=(C1.img*C2.img);
		System.out.println("Multiplication of Complex Numbers =("+real+")+("+img+")i");
	}
	public void divNum(Complex_No C1,Complex_No C2)
	{
		// Method to divide two complex numbers
		float real,img;
		//Validation for divisor should not equal to zero 
		if(C2.real==0||C2.img==0)
		{
		    System.out.println("Divisor should not be zero");
		}
		else
		{
		    real=(C1.real/C2.real);
		    img=(C1.img/C2.img);
		    System.out.println("Division of Complex Numbers =("+real+")+("+img+")i");
		}
	}
}

public class complex_number
{
	public static void main(String[] args)
	{
		int num1,num2,choice=0;
		Complex_No cal=new Complex_No();
		Scanner Sc=new Scanner(System.in);
		
		System.out.print("Enter real part of First Number : ");
		num1=Sc.nextInt();
		System.out.print("Enter imginary part of First Number : ");
		num2=Sc.nextInt();
		Complex_No Com1=new Complex_No(num1,num2);
		System.out.print("Enter real part of Second Number : ");
		num1=Sc.nextInt();
		System.out.print("Enter imginary part of Second Number : ");
		num2=Sc.nextInt();
		Complex_No Com2=new Complex_No(num1,num2);
		cal.Display(Com1,Com2);
		do
		{
		    System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
		    System.out.println("Enter choice :");
		    choice=Sc.nextInt();
		    switch(choice)
		    {
		        case 1 :
		            cal.AddNum(Com1,Com2);
		            break ;
		        case 2 :
		            cal.subNum(Com1,Com2);
		            break ;
    		    case 3 :
    		        cal.mulNum(Com1,Com2);
    		        break ;
    		    case 4 :
    		        cal.divNum(Com1,Com2);
    		        break ;
    		    case 5 :
    		        break ;
    		    default :
    		    System.out.println("Invalid choice");
		    }
		
		}while (choice<5);
	}
}




