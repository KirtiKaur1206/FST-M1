/*
In this activity we will be implementing Hybrid Inheritance (Multiple and Simple)

Start by creating two interfaces - BicycleParts and BicycleOperations
In BicycleParts:
    public int gears: number of gears on the bicycle
    public int speed: max speed of bicycle
In BicycleOperations:
    public applyBrake(int decrement): how much to slow down the bicycle by.
    public speedUp(int increment): how much to speed up the bicycle by.
Next create the base class Bicycle. It implements both interfaces BicycleParts, BicycleOperations.
Initialize the values of gears and currentSpeed in a constructor.
Write the definition of the applyBrake() and speedUp().
applyBrake() reduces the currentSpeed by the number passed to the method.
speedUp() increases the currentSpeed by the number passed to the method.
Add another method to the base class - bicycleDesc().
It prints the number of gears and the currentSpeed of the bicycle.

public String bicycleDesc() {
    return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
}

Now create a derived class, MountainBike that extends Bicycle.
This class adds another property: seatHeight.
In the constructor for MountainBike, use the super keyword to include gears and currentSpeed for this class. Also initialize seatHeight.
Add setHeight() method to the class to add a new value for the seatHeight variable.

public void setHeight(int newValue) {
    seatHeight = newValue;
}

Override the bicycleDesc() method of the super class to print the seat height also.

Finally we make the driver class that contains the main method.
Create an object for the MountainBike class.
Use this object to access the different variables and methods.

public static void main(String args[]) {
    MountainBike mb = new MountainBike(3, 0, 25);
    System.out.println(mb.bicycleDesc());
    mb.speedUp(20);
    mb.applyBrake(5);
}
 */


package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    public void onboard(String passenger) {
        this.passengers.add(passenger);
    }

    public Date takeOff() {
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }

    public void land() {
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public List<String> getPassengers() {
        return passengers;
    }
}

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        //There is a plane with max 10 passengers
        Plane plane = new Plane(10);
        //Add passengers on the list
            plane.onboard("John");
            plane.onboard("Steve");
            plane.onboard("Anna");
        //Plane takes off
            System.out.println("Plane took off at: " + plane.takeOff());
        //Print list of people on board
            System.out.println("People on the plane: " + plane.getPassengers());
        //Flying.....
            Thread.sleep(5000);
        //Plane has landed
            plane.land();
        //Plane lands
            System.out.println("Plane landed at: " + plane.getLastTimeLanded());
            System.out.println("People on the plane after landing: " + plane.getPassengers());
    }
}
