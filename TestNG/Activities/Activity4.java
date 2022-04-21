/*
This activity will show the usage of testng.xml to execute multiple classes.

[Optional] Create a package named suiteExample
Create a new TestNG class file named DemoOne.java in the package.
It will have two @Test methods

Create another TestNG class named DemoTwo.java in the suiteExample package.
This class will have only one @Test method

Activity 4
Create the testng.xml file and add both the classes to the list of classes to execute.

This will make both the tests execute one after the other.
 */

package FST_TestNG;
import org.testng.annotations.Test;

public class DemoOne {
    @Test
    public void firstTestCase() {
        System.out.println("I'm in first test case from demoOne Class");
    }

    @Test
    public void secondTestCase() {
        System.out.println("I'm in second test case from demoOne Class");
    }
}
