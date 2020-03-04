/*
 * This Class is all car settings for the 3 cars that the user is prompted to 
 * enter in the CarTester.java client program
 */
package cartester;
/**
 *
 * @author Jordan Hamilton
 */
public class Car {

    // A constructor that sets all defualts of the car if the user's input contains nothing
    public static void CarDefualts(){
        int year; 
        double price; 
        int horsepower; 
        double weight; 
        String make; 
        String model;
        
        make = "Ford";
        model = "Mustang";
        year = 2019;
        price = 63000;
        horsepower = 550;
        weight = 3705;
    } 
    // this is the assining constructor for the first car, this takes all inputs and stores them to be used later
    public static void Car1Characteristics(String make, String model, int year, double price, int horsepower, double weight){
        System.out.println("");
        System.out.println("Car #1");
        System.out.println("Make: " + make +"\n"+ "Model: " + model +"\n"+ "Year: " + year+"\n" + "Price: $" + price +"\n"+ "HorsePower: " + horsepower +"\n" + "Weight: " + weight + " Pounds");
    }
    public void Car2Characteristics(String make1, String model1, int year1, double price1, int horsepower1, double weight1){
        System.out.println("");
        System.out.println("Car #2");
        System.out.println("Make: " + make1 +"\n"+ "Model: " + model1 +"\n"+ "Year: " + year1 +"\n" + "Price: $" + price1 +"\n"+ "HorsePower: " + horsepower1 +"\n" + "Weight: " + weight1 + " Pounds");
    }
    public void Car3Charictaristics(String make2, String model2, int year2, double price2, int horsepower2, double weight2){
        System.out.println("");
        System.out.println("Car #3");
        System.out.println("Make: " + make2 +"\n"+ "Model: " + model2 +"\n"+ "Year: " + year2 +"\n" + "Price: $" + price2 +"\n"+ "HorsePower: " + horsepower2 +"\n" + "Weight: " + weight2 + " Pounds");
    }
    
}

