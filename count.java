class BankAccount {
private int balance = 1000;
// Deposit method
public synchronized void deposit(String user, int amount) {
System.out.println(user + " is depositing: " + amount);
balance += amount;
System.out.println(user + " new balance after deposit: " + balance);
}
// Withdraw method
public synchronized void withdraw(String user, int amount) {
System.out.println(user + " is withdrawing: " + amount);
if (balance >= amount) {
balance -= amount;
System.out.println(user + " new balance after withdrawal: " + balance);
} else {
System.out.println("Insufficient balance for " + user);
}
// Check balance
public void checkBalance(String user) {
System.out.println(user + " checking balance: " + balance);
}
}
}
// Class implementing Runnable
class BankingTask implements Runnable {
BankAccount account;
String userName;
// Constructor
BankingTask(BankAccount acc, String name) {
account = acc;
userName = name;
}
// run() method
public void run() {
try {
account.checkBalance(userName);
Thread.sleep(500);
account.deposit(userName, 500);
Thread.sleep(500);
account.withdraw(userName, 700);
Thread.sleep(500);
account.checkBalance(userName);
} catch (InterruptedException e) {
System.out.println(userName + " interrupted.");
}
}
}
// Main class
public class OnlineBankingDemo {
public static void main(String[] args) {
BankAccount account = new BankAccount();
// Creating threads for multiple users
Thread t1 = new Thread(new BankingTask(account, "User-1"));
Thread t2 = new Thread(new BankingTask(account, "User-2"));
Thread t3 = new Thread(new BankingTask(account, "User-3"));
// Starting threads
t1.start();
t2.start();
t3.start();
}
}