/*
In the class Activity1, create an Object of the Car class
    Car carName = new Car();
Initialize the values of
    make to 2014
    color to "Black"
    transmission to "Manual"

Call the methods in the Car class to print the characteristics of the car, and what happens when you accelerate()
and brake().
 */

package activities;
public class Activity1 {

    public static class Car {
        //Class Member Variables
        String color;
        int make;
        String transmission;

        //Class Methods
        public void characterstics(){
            System.out.println("Color of the my car: " + color);
            System.out.println("Make of the my car: " + make);
            System.out.println("Transmission of the car: " + transmission);
        }
        public void accelerate() {
            System.out.println("Drive the car");
        }
        public void brake() {
            System.out.println("Stop the car");
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.make = 2020;
        myCar.color = "Forest Green";
        myCar.transmission = "Automatic";

        //Using Car class method
        myCar.characterstics();
        myCar.accelerate();
        myCar.brake();
    }
}
