/*
In this activity, we create a custom Exception handler.
Create a class named CustomException that extends the Exception class.
Add a private String variable named message that is going to be the exception message.
Add constructor that initializes the message variable with the custom String passed in.
Add an Override annotation for getMessage() that returns the custom message.

@Override
public String getMessage() {
    return message;
}

Now create the main class that contains the main function.
Add a method to this class called exceptionTest() that will throw the CustomException if the string value is null.
Otherwise, it simply prints the string.
In the main method, call the exceptionTest() method with a non-null string and also a method call with a null argument.
In the catch block, add a print statement to print the custom error message.

CustomExceptionActivity.exceptionTest("Will print to console");
CustomExceptionActivity.exceptionTest(null);
 */

package activities;

interface BicycleParts {
    public int gears = 0;
    public int currentSpeed = 0;
}

interface BicycleOperations {
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}
//Base class
class Bicycle implements BicycleParts, BicycleOperations {

    public int gears;
    public int currentSpeed;

    //the Bicycle class has one constructor
    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    //Bicycle class has three methods
    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
        System.out.println("Current speed: " + currentSpeed);
    }

    public void speedUp(int increment) {
        currentSpeed += increment;
        System.out.println("Current speed: " + currentSpeed);
    }

    //Method to print info of Bicycle
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }
}

//Derived class
class MountainBike extends Bicycle {

    //The MountainBike subclass adds one more field
    public int seatHeight;

    //The MountainBike subclass has one constructor
    public MountainBike(int gears, int currentSpeed, int startHeight) {
        //Invoking base-class(Bicycle) constructor
        super(gears, currentSpeed);
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one more method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    }
}

//Driver class
public class Activity7 {
    public static void main(String args[]) {
        MountainBike mb = new MountainBike(3, 0, 25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
    }
}
