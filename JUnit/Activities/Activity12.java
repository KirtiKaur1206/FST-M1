/*
In this activity, we will be creating a functional interface and use it with a lambda expression.
Create an interface named Addable that contains a single method, add(). This method accepts two arguments,
num1 and num2.
Next, create a class named Activity12 with a main method.
In this main method, create two variables, both of type Addable(the interface).
One variable, say ad1, contains a lambda expression(no body), that saves the result of num1 plus num2.
The other variable, say ad2, contains a lambda function(has a body),
that also saves the result of num1 plus num2.

Hint:
For ad1, use the following lambda expression:
    Addable ad1 = (a, b) -> (a + b);
For ad2, use the following lambda function:
    Addable ad2 = (int a, int b) -> {
    return (a + b);
    };
 */
package activities;

interface Addable {
    int add(int a, int b);
}

public class Activity12 {
    public static void main(String[] args) {

        // Lambda expression without return keyword.
        Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10, 20));

        // Lambda expression with return keyword.
        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad2.add(100, 200));
    }
}
