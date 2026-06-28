class Calculator {
// Instance method 1
void add(int a, int b) {
int sum = a + b;
System.out.println("Addition of two numbers: " + sum);
}
// Overloaded method
void add(int a, int b, int c) {
int sum = a + b + c;
System.out.println("Addition of three numbers: " + sum);
}
// Method to be overridden
void show() {
System.out.println("This is Calculator class method");
}
}
// Child Class
class AdvancedCalculator extends Calculator {
// Overridden method
void show() {
System.out.println("This is AdvancedCalculator class method");
}
// Additional instance method
void multiply(int a, int b) {
int result = a * b;
System.out.println("Multiplication: " + result);
}
}
// Main Class
public class DynamicMethodDemo {
public static void main(String[] args) {
// Creating object of parent class
Calculator c1 = new Calculator();
// Calling overloaded methods
c1.add(10, 20);
c1.add(10, 20, 30);
// Dynamic method invocation
Calculator c2;
// Object of child class assigned to parent reference
c2 = new AdvancedCalculator();
// Runtime decides which method to execute
c2.show();
// Creating child class object
AdvancedCalculator ac = new AdvancedCalculator();
ac.multiply(5, 4);
}
}
