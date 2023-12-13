import java.util.Scanner;
class publication
{
	String title;
	int prize,total,copies,total_sell;
	Scanner sc =new Scanner(System.in);
	
	public void get_data() 
	{
		// Method to get input
		System.out.println("Enter title :");
		this.title= sc.nextLine();
		System.out.println("Enter prize :");
		this.prize = sc.nextInt();
		System.out.println("Enter copies :");
		this.copies =sc.nextInt();
		
	}
	public void saleCopy( int Qty)
	{
		// Method to purchase book
		if(Qty<=copies) {
			copies = copies-Qty;
			total_sell=total+Qty*prize;
			System.out.println("\n---------------PURCHASED BILL---------------");
			System.out.println("Title : "+title);
			System.out.println("YOU PURCHASED "+Qty +" copies");
			System.out.println("Total amount to be pay is :"+prize*Qty);
			System.out.println("--------------------------------------------\n\n");
		}
		else {
			System.out.println("INSUFFICIENT STOCK !!!!!!!!");
		}
	}
}
// derived  class (book)
class book extends publication
{
	String author;
	
	public void order_copies(int num)
		{ 
		    //to order copies
	    	copies=copies+num;
			System.out.println("--------------------------------------------");
	        System.out.println("\nORDER SUCESSFUL....");
		    System.out.println("COPIES AVAILABLE : "+copies);
		    System.out.println("--------------------------------------------");
		}
}
//derived class (magzine )
class magzine extends publication
{
	int issue_date;
	int iss;
	public void orderQty(int num)
	{
		//to order copies
	    copies=copies+num;
		System.out.println("--------------------------------------------");
		System.out.println("Total no of copies :"+copies);
		System.out.println("--------------------------------------------");
	}
	
	public void Current_issue()
	{
	    // Method to get Current issue 
		Scanner sc = new Scanner(System.in);
		get_data();
		System.out.println("Enter THe Current Issue Date [month] :");
		issue_date=sc.nextInt();

	}
	
	public void receive_issue()
	{	
	    // Method to get receive issue 
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter The receive Issue Date [year] :");
	    iss=sc.nextInt();

		if(iss==issue_date)
		{
			System.out.println("YOU RECEIVED CURRENT ISSUE \n");
		}
		else
		{
			System.out.println("YOU RECEIVED OLD ISSUE \n");
		}
		    
    }
}
	
public class Library 
{
    public static void main(String[] args)
    {
	    publication p =new publication();
	    book b = new book();
	    magzine m = new magzine();
	    int choice,b1,m1;
	    Scanner sc = new Scanner(System.in);
        do {
    	    System.out.println("Enter Your choice : \n 1.Book \n 2.Magzine\n 3.Exit\n\n");
    	    choice= sc.nextInt();
            switch (choice)
    	    {
    	        case 1 :
    		        do{
            		    System.out.println("Enter choice :\n 1.Enter data for book\n 2.Purchased new book\n 3.Order new books\n 4.Exit\n\n");
            		    b1=sc.nextInt();
            		    switch (b1)
            		    {
            			    case 1:
            				    b.get_data();
            				    break;
            			    case 2:
            				    int qty;
            				    System.out.println("Enter quntity to be purchased :");
            				    qty = sc.nextInt();
            				    b.saleCopy(qty);
            			    	break;
            			    case 3:
            				    int num;
            				    System.out.println("Enter no of copies to order :");
            				    num = sc.nextInt();
            				    b.order_copies( num);
            				    break;
            			    case 4:
            			        break;
            			    default :
            				    System.out.println("Invalid choice ");
            				    break;
            		      } 
        		      }while (b1<4);
        		        break;
    	        case 2 :
        	        do{
            		    System.out.println("Enter choice :\n 1.Enter data for magzine\n 2.Purchased new book\n 3.Order new magzine\n 4.receive new Issue\n 5.Exit\n\n");
            		    m1=sc.nextInt();
            		    switch (m1)
            		    {
            			    case 1:
            				    m.Current_issue();
            				    break;
            			    case 2:
            				    int qty;
            				    System.out.println("Enter quntity to be purchased :");
            				    qty = sc.nextInt();
            				    m.saleCopy(qty);
            				    break;
            			    case 3:
            				    int num;
            				    System.out.println("Enter no of copies to order :");
            				    num = sc.nextInt();
            				    m.orderQty(num);
            				    break;
            			    case 4:
            			        m.receive_issue();
            			        break;
            	            case 5:
            			        break;
            			    default :
            				    System.out.println("Invalid choice ");
            				    break;
            		    }
    	    	    }while (m1<5);
    		        break;
    	       case 3:
    			    break;
    		    default :
    		        System.out.println("Invalid choice ");
    		        break;
            }
        }while(choice<3);
    }
}

