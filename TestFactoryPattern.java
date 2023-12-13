
import java.util.Scanner;

//Abstract Car class
abstract class Car {
 String carType;

 public abstract void allocateAccessories();

 public abstract void assembleBody();

 public abstract void paint();

 public abstract void addFeatures();

 public void displayCarInfo() {
     System.out.println("Car Type: " + carType);
 }
}

//Hatchback class
class Hatchback extends Car {
 public Hatchback() {
     carType = "Hatchback";
 }

 @Override
 public void allocateAccessories() {
     System.out.println("Allocating accessories for Hatchback");
 }

 @Override
 public void assembleBody() {
     System.out.println("Assembling body for Hatchback");
 }

 @Override
 public void paint() {
     System.out.println("Painting Hatchback");
 }

 @Override
 public void addFeatures() {
     System.out.println("Adding features for Hatchback");
 }
}

//Sedan class
class Sedan extends Car {
 public Sedan() {
     carType = "Sedan";
 }

 @Override
 public void allocateAccessories() {
     System.out.println("Allocating accessories for Sedan");
 }

 @Override
 public void assembleBody() {
     System.out.println("Assembling body for Sedan");
 }

 @Override
 public void paint() {
     System.out.println("Painting Sedan");
 }

 @Override
 public void addFeatures() {
     System.out.println("Adding features for Sedan");
 }
}

//SUV class
class SUV extends Car {
 public SUV() {
     carType = "SUV";
 }

 @Override
 public void allocateAccessories() {
     System.out.println("Allocating accessories for SUV");
 }

 @Override
 public void assembleBody() {
     System.out.println("Assembling body for SUV");
 }

 @Override
 public void paint() {
     System.out.println("Painting SUV");
 }

 @Override
 public void addFeatures() {
     System.out.println("Adding features for SUV");
 }
}

//CarFactory class
class CarFactory {
 public Car createCar(String carType) {
     if (carType.equalsIgnoreCase("Hatchback")) {
         return new Hatchback();
     } else if (carType.equalsIgnoreCase("Sedan")) {
         return new Sedan();
     } else if (carType.equalsIgnoreCase("SUV")) {
         return new SUV();
     } else {
         return null; // Handle unsupported car types
     }
 }
}

//TestFactoryPattern class
public class TestFactoryPattern {
 public static void main(String[] args) {
     Scanner vk = new Scanner(System.in);
     CarFactory carFactory = new CarFactory();

     System.out.println("Enter the type of car you want to build (Hatchback/Sedan/SUV):");
     String carType = vk.nextLine();

     Car car = carFactory.createCar(carType);

     if (car != null) {
         car.allocateAccessories();
         car.assembleBody();
         car.paint();
         car.addFeatures();
         car.displayCarInfo();
     } else {
         System.out.println("Invalid car type. Please enter Hatchback, Sedan, or SUV.");
     }

     vk.close();
 }
}
