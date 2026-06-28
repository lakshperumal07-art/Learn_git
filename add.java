import java.util.Scanner;
// Interface declaration
interface StudentOperations {
void getStudentDetails();
void getMarks();
void calculateTotal();
void calculateAverage();
void calculateGrade();
void displayResult();
}
// Class implementing the interface
class StudentResult implements StudentOperations {
int rollNo;
String name;
int m1, m2, m3, m4, m5;
int total;
double average;
char grade;
Scanner sc = new Scanner(System.in);
// Method to get student details
public void getStudentDetails() {
System.out.println("Enter Student Roll Number:");
rollNo = sc.nextInt();
sc.nextLine(); // consume newline
System.out.println("Enter Student Name:");
name = sc.nextLine();
}
// Method to get marks
public void getMarks() {
System.out.println("Enter Marks for 5 Subjects:");
System.out.print("Subject 1: ");
m1 = sc.nextInt();
System.out.print("Subject 2: ");
m2 = sc.nextInt();
System.out.print("Subject 3: ");
m3 = sc.nextInt();
System.out.print("Subject 4: ");
m4 = sc.nextInt();
System.out.print("Subject 5: ");
m5 = sc.nextInt();
}
// Method to calculate total
public void calculateTotal() {
total = m1 + m2 + m3 + m4 + m5;
}
// Method to calculate average
public void calculateAverage() {
average = total / 5.0;
}
// Method to calculate grade
public void calculateGrade() {
if (average >= 90)
grade = 'A';
else if (average >= 75)
grade = 'B';
else if (average >= 60)
grade = 'C';
else if (average >= 40)
grade = 'D';
else
grade = 'F';
}
// Method to display result
public void displayResult() {
System.out.println("\n========== STUDENT RESULT ==========");
System.out.println("Roll Number : " + rollNo);
System.out.println("Student Name : " + name);
System.out.println("Marks in Subject 1 : " + m1);
System.out.println("Marks in Subject 2 : " + m2);
System.out.println("Marks in Subject 3 : " + m3);
System.out.println("Marks in Subject 4 : " + m4);
System.out.println("Marks in Subject 5 : " + m5);
System.out.println("Total Marks : " + total);
System.out.println("Average Marks : " + average);
System.out.println("Grade : " + grade);
if (grade != 'F')
System.out.println("Result Status : PASS");
else
System.out.println("Result Status : FAIL");
}
}
// Main class
public class InterfaceDemo {
public static void main(String[] args) {
StudentResult s = new StudentResult();
s.getStudentDetails();
s.getMarks();
s.calculateTotal();
s.calculateAverage();
s.calculateGrade();
s.displayResult();
}
}