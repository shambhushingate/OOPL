import java.util.*;
interface Vehicle 
{
    void gear_Change(int newGear);
    void speed_Up(int increse);
    void apply_Brakes(int decrese);
}
// Implement the Vehicle interface for Bicycle
class Bicycle implements Vehicle 
{
 private
    int gear;
    int speed;
    public Bicycle()
    {
        //  constructor
        this.gear = 1;
        this.speed = 0;
    }
   
    public void gear_Change(int newGear)
    {
        // Method to change gear
        gear = newGear;
        System.out.println("Bicycle gear changed to : " + gear);
    }
    
    public void speed_Up(int increse) 
    {
        // Method to change speed
        speed += increse;
        System.out.println("Bicycle is speeding up to : " + speed );
    }
    
    public void apply_Brakes(int decrese) 
    {
        // Method to apply Brakes
        // validation for speed
        if (speed > 0) 
        {
            speed -= decrese;
            System.out.println("Bicycle speed is reduced to " + speed+ " by applying brakes");
        } else 
        {
            System.out.println("Bicycle is already at rest.");
        }
    }
}
// Implement the Vehicle interface for Bike
class Bike implements Vehicle 
{
 private 
    int gear;
    int speed;
    
    public Bike() 
    {
        // constructor   
        this.gear = 1;
        this.speed = 0;
    }
    
    public void gear_Change(int newGear) 
    {
        // Method to change gear
        gear = newGear;
        System.out.println("Bike gear changed to : " + gear);
    }

    public void speed_Up(int increse) 
    {
        // Method to change speed
        speed += increse;
        // validation for speed 
        if(speed<=80)
        {
            System.out.println("Bike is speeding up to : " + speed);
        }else
        {
            System.out.println("Crossing speed limit!!!");
            speed -= increse;
        }
    }

    public void apply_Brakes(int decrese) 
    {
        // Method to apply Brakes
        // validation for speed
        if (speed > 0) 
        {
            speed -= decrese;
            System.out.println("Bike speed is reduced to " + speed + " by applying brakes");
        } else
        {
            System.out.println("Bike is already at rest.");
        }
    }  
}
// Implement the Vehicle interface for Car
class Car implements Vehicle 
{
 private 
    int gear;
    int speed;

    public Car() 
    {
        //  constructor   
        this.gear = 1;
        this.speed = 0;
    }
    
    public void gear_Change(int newGear) 
    {
        // Method to change gear
        gear = newGear;
        System.out.println("Car gear changed to : " + gear);
    }

    public void speed_Up(int increse) 
    {
        // Method to change speed
        speed += increse;
        // validation for speed
        if(speed<=80)
        {
            System.out.println("Car is speeding up to : " + speed);
        }else
        {
            System.out.println("Crossing speed limit!!!");
            speed -= increse;
            
        }
    }

    public void apply_Brakes(int decrese) 
    {
        // Method to apply Brakes
        // validation for speed
        if (speed > 0) 
        {
            speed -= decrese;
            System.out.println("Car speed is reduced to " + speed + " by applying brakes");
        } else
        {
            System.out.println("Car is already at rest.");
        }
    }  
}
public class interface_vehicle 
{
    public static void main(String[] args) 
    {
        Vehicle bicycle = new Bicycle();
        Vehicle bike = new Bike();
        Vehicle car = new Car();
        Scanner sc = new Scanner (System.in);
        int choice,ch1,ch2,ch3 ;
        
        do{
            System.out.println("---------------------------------------------------------");
            System.out.println("VEHICLE\n");
            System.out.println(" 1.Bicycle\n 2.Bike\n 3.Car\n 4.Exit\n");
            System.out.println("Enter choice :");
            choice = sc.nextInt();
            switch(choice)
                {
                    case 1:
                        do{
                            System.out.println("\n 1.Gear Change\n 2.Speed Up\n 3. Apply Brakes\n 4.Exit\n");
                            System.out.println("Enter choice :");
                            ch1=sc.nextInt();
                
                            switch(ch1)
                            {
                                case 1:
                                        int x;
                                        System.out.println("Enter new gear :");
                                        x=sc.nextInt();
                                        bicycle.gear_Change(x);
                                        break;
                                case 2:
                                        int y;
                                        System.out.println("Enter by how many units want to increse the speed");
                                        y=sc.nextInt();
                                        bicycle.speed_Up(y);
                                        break;
                                case 3:
                                        int z;
                                        System.out.println("Enter by how many units want to decrese the speed");
                                        z=sc.nextInt();
                                        bicycle.apply_Brakes(z);
                                        break;
                                case 4:
                                        System.out.println("---------------------------------------------------------");
                                        break;
                                default :
                                        System.out.println("Invalid choicce !!");
                                        break;
                            }
                        }while(ch1<4);
                        break;
                
                    case 2:
                        do{
                            System.out.println("\n 1.Gear Change\n 2.Speed Up\n 3. Apply Brakes\n 4.Exit\n");
                            System.out.println("Enter choice :");
                            ch2=sc.nextInt();
                            switch(ch2)
                            {
                                case 1:
                                        int x;
                                        System.out.println("Enter new gear :");
                                        x=sc.nextInt();
                                        bike.gear_Change(x);
                                        break;
                                case 2:
                                        int y;
                                        System.out.println("Enter by how many units want to increse the speed");
                                        y=sc.nextInt();
                                        bike.speed_Up(y);
                                        break;
                                case 3:
                                        int z;
                                        System.out.println("Enter by how many units want to decrese the speed");
                                        z=sc.nextInt();
                                        bike.apply_Brakes(z);
                                        break;
                                case 4:
                                        System.out.println("---------------------------------------------------------");
                                        break;
                                default :
                                        System.out.println("Invalid choicce !!");
                                        break;
                            }
                        }while(ch2<4);
                        break;
                    case 3:
                        do{
                            System.out.println("1.Gear Change\n 2.Speed Up\n 3. Apply Brakes\n 4.Exit\n");
                            System.out.println("Enter choice :");
                            ch3=sc.nextInt();
                            switch(ch3)
                            {
                            case 1:
                                int x;
                                System.out.println("Enter new gear :");
                                x=sc.nextInt();
                                car.gear_Change(x);
                                break;
                            case 2:
                                int y;
                                System.out.println("Enter by how many units want to increse the speed");
                                y=sc.nextInt();
                                car.speed_Up(y);
                                break;
                            case 3:
                                int z;
                                System.out.println("Enter by how many units want to decrese the speed");
                                z=sc.nextInt();
                                car.apply_Brakes(z);
                                break;
                            case 4:
                                System.out.println("---------------------------------------------------------");
                                break;
                            default :
                                System.out.println("Invalid choicce !!");
                                break;
                            }
                        }while(ch3<4);
                        break;
                    case 4:
                        System.out.println("Exiting the prograam");
                        System.out.println("---------------------------------------------------------");
                        break;
                    default :
                        System.out.println("Invalid choicce !!");
                }
        }while (choice<3);
    }
}
