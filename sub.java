public class ExceptionDemo {
public static void main(String[] args) {
System.out.println("===== EXCEPTION HANDLING DEMO =====");
// 1. ArithmeticException
try {
System.out.println("\n1. ArithmeticException Example");
int a = 10, b = 0;
int result = a / b;
System.out.println("Result: " + result);
} catch (ArithmeticException e) {
System.out.println("Exception Caught: Cannot divide by zero.");
}
// 2. ArrayIndexOutOfBoundsException
try {
System.out.println("\n2. ArrayIndexOutOfBoundsException Example");
int arr[] = {10, 20, 30, 40, 50};
System.out.println("Array Element: " + arr[10]);
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Exception Caught: Invalid array index.");
}
// 3. NullPointerException
try {
System.out.println("\n3. NullPointerException Example");
String name = null;
System.out.println("Length of Name: " + name.length());
} catch (NullPointerException e) {
System.out.println("Exception Caught: String value is null.");
}
// 4. NumberFormatException
try {
System.out.println("\n4. NumberFormatException Example");
String str = "ABC";
int num = Integer.parseInt(str);
System.out.println("Converted Number: " + num);
} catch (NumberFormatException e) {
System.out.println("Exception Caught: Invalid number format.");
}
// finally block
finally {
System.out.println("\nProgram executed successfully with exception
handling.");
}
}
}