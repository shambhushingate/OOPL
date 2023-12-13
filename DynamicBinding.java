import java.util.*;
// base class
class shape
{
	double parameter_1;
	double parameter_2;
	Scanner sc =new Scanner(System.in);
	
	// Method to get data
	void get_data(String x,String y)
	{
	    
		System.out.println("Enter value of "+x+" :");
		parameter_1=sc.nextDouble();
		System.out.println("Enter value of "+y+ ":");
		parameter_2=sc.nextDouble();
		
	}
	
	// method for computing area	
	void compute_area()
	{
        	
	}
}
class triangle extends shape
{
    double height;
	double base;
	
	// constructor
	triangle(double parameter_1,double parameter_2)
	{
	    
		this.base=parameter_1;
		this.height=parameter_2;
	}
	
	//Override
	void compute_area(double base, double height)
	{
	    if (base<= 0 || height <= 0)
	    {
            System.out.println("Invalid dimensions for a rectangle.\n(Please enter positive nonzero values.)\n");
        }
        else
        {
		    double area =0.5*base*height;
            System.out.println("Area of triangle is :"+area);
        }
	}
}

class rectangle extends shape
{
    
	double length;
	double breadth;
	// constructor
	rectangle(double parameter_1,double parameter_2)
	{
	    
		this.length=parameter_1;
		this.breadth=parameter_2;
	}
	//Override
	void compute_area(double length,double breadth)
	{
	    
	    if (length <= 0 || breadth<= 0)
	    {
            System.out.println("Invalid dimensions for a rectangle.\n(Please enter positive nonzero values.)\n");
        }
        else
        {
		    double ans =(breadth*length);
		    System.out.println("Area of triangle is :"+ans);
        }
	}
}

public class DynamicBinding {

	public static void main(String[] args) 
	{
		shape s1=new shape();
		int choice;
		Scanner sc =new Scanner(System.in);
		
		do {
		    System.out.println("\n1:Triangle\n2:Rectangle\n3.exit\n");
		    System.out.println("Enter choice :");
		    choice = sc.nextInt();
		    switch(choice)
		    {
			    case 1:
				    String a="base" , b="height";
				    s1.get_data(a ,b);
				    // validation for parameter should not be zero or less than zero  
				    if(s1.parameter_1<=0 || s1.parameter_2<=0)
		                {
		                System.out.println("Invalid input !!!\nPlese enter valid number ");
		                s1.get_data(a ,b);
		                }
				    triangle tr= new triangle(s1.parameter_1,s1.parameter_2);
				    tr.compute_area(tr.base,tr.height);
				    break;
			    case 2:
				    String c="length",d="breadth";
				    s1.get_data(c,d);
				    // validation for parameter should not be zero or less than zero 
				    if(s1.parameter_1<=0 || s1.parameter_2<=0)
		                {
		                System.out.println("Invalid input !!!\nPlese enter valid number ");
		                s1.get_data(c,d);
		                }
				    rectangle rect =new rectangle(s1.parameter_1,s1.parameter_2);
				    rect.compute_area(rect.length,rect.breadth);
				    break;
			    case 3:
				    System.out.println("Exiting the program\n");
				    break;
			    default:
				    System.out.println("Invalid choice");
			}
		    }while(choice!=3);
	}
}