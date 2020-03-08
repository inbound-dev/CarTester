/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartester;
import java.util.Scanner;
/**
 *
 * @author Jorda
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // all variables that will be sent to the car classes 
        String make, make1, make2, model, model1, model2;
        double price , price1, price2, weight, weight1, weight2; 
        int year, year1, year2, horsepower, horsepower1, horsepower2;
        
        // Creating Scanner Object
        Scanner Input = new Scanner(System.in);
        
        // asking user for all car parameters
        System.out.println("Please Enter the Make of Car Number 1");
        make = Input.next();
        
        System.out.println("What is the model");
        model = Input.next();
        
        System.out.println("What is the year");
        year = Input.nextInt();
        
        System.out.println("What is the horsepower");
        horsepower = Input.nextInt();
        
        System.out.println("What is the price");
        price = Input.nextDouble();
        
        System.out.println("Finally what is the weight");
        weight = Input.nextDouble();
        
        System.out.println("Please Enter the Make of Car Number 2");
        make1 = Input.next();
        
        System.out.println("What is the model");
        model1 = Input.next();
        
        System.out.println("What is the year");
        year1 = Input.nextInt();
        
        System.out.println("What is the horsepower");
        horsepower1 = Input.nextInt();
        
        System.out.println("What is the price");
        price1 = Input.nextDouble();
        
        System.out.println("Finally what is the weight");
        weight1 = Input.nextDouble();
        
        System.out.println("Please Enter the Make of Car Number 3");
        make2 = Input.next();
        
        System.out.println("What is the model");
        model2 = Input.next();
        
        System.out.println("What is the year");
        year2 = Input.nextInt();
        
        System.out.println("What is the horsepower");
        horsepower2 = Input.nextInt();
        
        System.out.println("What is the price");
        price2 = Input.nextDouble();
        
        System.out.println("Finally what is the weight");
        weight2 = Input.nextDouble();
        
        // sending all the data to the classes 
        Car.Car1Characteristics(make, model, year, price, horsepower, weight);
        Car.Car2Characteristics(make1, model1, year1, price1, horsepower1, weight1);
        Car.Car3Charictaristics(make2, model2, year2, price2, horsepower2, weight2);
        
        // asking the user if they want to honk the horn
        System.out.println("Would you like to honk the horn?");
        if(Input.equals("Honk") || Input.equals("honk") || Input.equals("yes")){
            System.out.println("OK");
            System.out.println("Honk Honk!");
        }
        else {
            System.out.println("OK");
        }
        
    }
    
}
