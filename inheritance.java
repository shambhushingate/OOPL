import java.util.Scanner;
// base class
class employee{
  public
    String Emp_name;
    long Emp_id;
    String Address;
    String Mail_id;
    String Mobile_no;
    long BP;
	long DA;
	long HRA;
	long PF;
	long staff;
	
	// Method to get data
    public void get_data()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter name :");
        Emp_name=sc.nextLine();
        System.out.println("Enter Employee ID:");
        Emp_id=sc.nextLong();
        System.out.println("Enter Address :");
        Address=sc.next();
        System.out.println("Enter Mail ID :");
        Mail_id=sc.next();
        // validationfor mail id
        while(!valid_mail(Mail_id))
        {
            System.out.println("INVALID MAIL ID !!\nPlease enter valid mail ID :");
            Mail_id=sc.next();
        }
        System.out.println("Enter Mobile no :");
        Mobile_no=sc.next();
        // validation for mobile number
        while(Mobile_no.length()<10||Mobile_no.length()>10)
        {
            System.out.println("INVALID MOBILE NUMBER !!\nPlease enter valid mobile number :");
            Mobile_no=sc.next();
        }
    }
     public  boolean valid_mail (String email) {
        // Check if the email address ends with "@gmail.com"
        if(email.endsWith("@gmail.com"))
        {
            return true;
        }else{
        return false;
        }
    }
    public long da() {
		long DA=(97*BP)/100;
		
		return DA;
	}
	public long hra() {
		long HRA=(10*BP)/100;
		return HRA;
	}
	
	public long pf() {
		long PF=(12*BP)/100;
		return PF;
	}
	public long stf() {
		long staff=(1*BP)/1000;
		return staff;
	}
    void dis(String x)
    {
        // Method to display payment slip
        System.out.println("----------------------------------------------------------------");
        System.out.println("\n                 PAYMENT SLIP\n");
        System.out.println("                      "+x);
        System.out.println("NAME :        "+Emp_name);
        System.out.println("EMPLOYEE ID : "+Emp_name);
        System.out.println("ADDRESS :     "+Address);
        System.out.println("MAIL ID :     "+Mail_id);
        System.out.println("MOBILE NO :   "+Mobile_no);
        System.out.println("\n\n");
    }
}
// derived class
class Programmer extends employee{
    long gross_salary, net_salary ;
    public void get_bp()
    {
        // Method to get basic pay
        get_data();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic pay (Upto:$10000):\n");
        BP=sc.nextLong();
        //validation for basicpay
        while(BP>10000){
            System.out.println("Invalid Basic Pay..!\nEnter basic pay (Upto:$10000):\n ");
            BP=sc.nextLong();
        }
        
    }
    public long Gross_Salary() {
        // method to calculate gross salary
        gross_salary=BP + da()+ hra();
        return gross_salary;
    }
    public long netsalary()
    {
        // method to calculatenet salary
        net_salary=Gross_Salary()-(pf()+stf());
        return net_salary;
    }
    public void display()
    {
        String x="PROGRAMMER";
        dis(x);
        System.out.println("  EARNINGS            AMOUNT       DIDUCTION         AMOUNT\n");
        System.out.println(" BASIC PAY            "+BP+"         PROVIDENT FUND    "+pf()+"\n");
        System.out.println(" DEARNESS ALLOWANCE   "+da()+"        STAFF CLUB FUND   "+stf()+"\n");
        System.out.println(" GROSS SALARY :       "+Gross_Salary()+"        NET SALARY:   "+netsalary()+"\n");
        System.out.println("----------------------------------------------------------------");
        
    }

    }

// derived class
class Team_Lead extends employee{
    long gross_salary, net_salary ;
    public void get_bp()
    {
        // methodto get basic pay
        get_data();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic pay (Upto:$20000):");
        BP=sc.nextLong();
        //validation for basicpay
        while(BP<0 && BP>20000){
            System.out.println("Invalid Basic Pay..!\nEnter basic pay (Upto:$20000): ");
            BP=sc.nextLong();
        }
        
    }
    public long Gross_Salary() {
        // method to calculate gross salary
        gross_salary=BP + da()+ hra();
        return gross_salary;
    }
    public long netsalary()
    {
        // method to calculate net salary
        net_salary=Gross_Salary()-(pf()+stf());
        return net_salary;
    }
    public void display()
    {
        String x="TEAM LEAD";
        dis(x);
        System.out.println("  EARNINGS            AMOUNT       DIDUCTION         AMOUNT\n");
        System.out.println(" BASIC PAY            "+BP+"         PROVIDENT FUND    "+pf()+"\n");
        System.out.println(" DEARNESS ALLOWANCE   "+da()+"         STAFF CLUB FUND   "+stf()+"\n");
        System.out.println(" GROSS SALARY :       "+Gross_Salary()+"         NET SALARY:   "+netsalary()+"\n");
        System.out.println("----------------------------------------------------------------");
        
    }

}
// derived class
class Assistant_Project_manager extends employee{
    long gross_salary, net_salary ;
    public void get_bp()
    {
        // method to get basic pay
        get_data();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic pay (Upto:$30000):");
        BP=sc.nextLong();
        //validation for basicpay
        while(BP<0 && BP>30000){
            System.out.println("Invalid Basic Pay..!\nEnter basic pay (Upto:$30000): ");
            BP=sc.nextLong();
        }
        
    }
    public long Gross_Salary() {
        // method to calculate gross salary
        gross_salary=BP + da()+ hra();
        return gross_salary;
    }
    public long netsalary()
    {
        // method to calculate net salary
        net_salary=Gross_Salary()-(pf()+stf());
        return net_salary;
    }
    public void display()
    {
        String x="Assistant Project manager";
        dis(x);
        System.out.println("  EARNINGS            AMOUNT       DIDUCTION         AMOUNT\n");
        System.out.println(" BASIC PAY            "+BP+"         PROVIDENT FUND    "+pf()+"\n");
        System.out.println(" DEARNESS ALLOWANCE   "+da()+"         STAFF CLUB FUND   "+stf()+"\n");
        System.out.println(" GROSS SALARY :       "+Gross_Salary()+"         NET SALARY:   "+netsalary()+"\n");
        System.out.println("----------------------------------------------------------------");
        
    }


}
// derived class
class  Project_Manager extends employee{
    long gross_salary, net_salary ;
    public void get_bp()
    {
        // method to get basic pay
        get_data();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic pay (Upto:$40000):");
        BP=sc.nextLong();
        //validation for basicpay
        while(BP<0 && BP>40000){
            System.out.println("Invalid Basic Pay..!\nEnter basic pay (Upto:$40000): ");
            BP=sc.nextLong();
        }
        
    }
    public long Gross_Salary() {
        // method to calculate gross salary
        gross_salary=BP + da()+ hra();
        return gross_salary;
    }
    public long netsalary()
    {
        // method to calculate net salary
        net_salary=Gross_Salary()-(pf()+stf());
        return net_salary;
    }
    public void display()
    {
        String x="Project Manager";
        dis(x);
        System.out.println("  EARNINGS            AMOUNT       DIDUCTION         AMOUNT\n");
        System.out.println(" BASIC PAY            "+BP+"         PROVIDENT FUND    "+pf()+"\n");
        System.out.println(" DEARNESS ALLOWANCE   "+da()+"         STAFF CLUB FUND   "+stf()+"\n");
        System.out.println(" GROSS SALARY :       "+Gross_Salary()+"         NET SALARY:   "+netsalary()+"\n");
        System.out.println("----------------------------------------------------------------");
        
    }


}

public class inheritance
{
	public static void main(String[] args) {
		Programmer p1 = new Programmer();
		Team_Lead t1 = new Team_Lead();
		Assistant_Project_manager a1 = new Assistant_Project_manager();
		Project_Manager m1 = new Project_Manager();
		int choice;
		Scanner sc = new Scanner (System.in);
		do{
		System.out.println("\n 1.Programmer\n 2.Team Lead\n 3.Assistant Project Manager\n 4.Project Manager\n 5. Exit");
		System.out.println("Enter choice :");
		choice=sc.nextInt();
		switch(choice)
		{
		    case 1:
		            p1.get_bp();
		            p1.display();
		            break;
		    case 2:
		            t1.get_bp();
		            t1.display();
		            break;
		    case 3:
		            a1.get_bp();
		            a1.display();
		            break;
		    case 4:
		            m1.get_bp();
		            m1.display();
		            break;
		    case 5 :
		            break;
		    default:
		            System.out.println("Invalid choice!!\n");
	                break;
		 }
		}while (choice<5);
	}
}