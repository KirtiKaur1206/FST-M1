/*
Now create the main class that contains the main function.

1. Add a method to this class called exceptionTest() that will throw the CustomException
if the string value is null. Otherwise, it simply prints the string.
2. In the main method, call the exceptionTest() method with a non-null string a
nd also a method call with a null argument.
3. In the catch block, add a print statement to print the custom error message.

CustomExceptionActivity.exceptionTest("Will print to console");
CustomExceptionActivity.exceptionTest(null);
 */

package activities;

class CustomException extends Exception {
    private String message = null;

    public CustomException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

public class Activity8 {
    public static void main(String[] a) {
        try {
            // Method call with correct input
            Activity8.exceptionTest("Will print to console");
            // Method call with incorrect input
            Activity8.exceptionTest(null); // Exception is thrown here
            Activity8.exceptionTest("Won't execute");
        } catch(CustomException mae) {
            System.out.println("Inside catch block: " + mae.getMessage());
        }
    }

    static void exceptionTest(String str) throws CustomException {
        if(str == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(str);
        }
    }
}
