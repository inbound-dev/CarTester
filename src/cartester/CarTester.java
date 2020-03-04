/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartester;
import cartester.Car;
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
        String make1, make2, make3, model, model1, model2;
        
        
        Scanner Input = new Scanner(System.in);
        
        System.out.println("Please Enter the Make of Car Number 1");
        make1 = Input.next();
        
        System.out.println("What is the model of Car Number 1");
        model = Input.next();
        
        System.out.println("Please Enter the Make of Car Number 2");
        make2 = Input.next();
        
        System.out.println("Please Enter the Make of Car Number 3");
        make3 = Input.next();
        
        Car.Car1Characteristics(make1, model);
        
    }
    
}
