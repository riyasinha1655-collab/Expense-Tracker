import java.util.ArrayList;
import java.util.Scanner;

class Expense {
    String title;
    double amount;

    Expense(String title, double amount) {
        this.title = title;
        this.amount = amount;
    }
}

public class ExpenseTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Expense> expenses = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n===== Expense Tracker (Console Version) =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Total Expense");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Expense Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();
                    expenses.add(new Expense(title, amount));
                    System.out.println("Expense Added Successfully!");
                    break;

                case 2:
                    System.out.println("\n---- Expense List ----");
                    if (expenses.isEmpty()) {
                        System.out.println("No expenses added yet.");
                    } else {
                        int i = 1;
                        for (Expense e : expenses) {
                            System.out.println(i + ". " + e.title + " - Rs." + e.amount);
                            i++;
                        }
                    }
                    break;

                case 3:
                    double sum = 0;
                    for (Expense e : expenses) {
                        sum += e.amount;
                    }
                    System.out.println("Total Expenses = Rs." + sum);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice! Try Again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
