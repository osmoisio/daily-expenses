package daily_expenses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DailyExpenses {

  public static void main(String[] args) {
    HashMap<Date, ArrayList<Expense>> dailyExpenses = new HashMap<>();

    addExpenses(dailyExpenses);
    printExpenses(dailyExpenses);
  }

  // Ask dates and expenses related to those dates as long as user wants
  public static void addExpenses(HashMap<Date, ArrayList<Expense>> dailyExpenses) {
    Scanner scanner = new Scanner(System.in);
    String dateFromUser;
    String answer;
    ArrayList<Expense> expenses = new ArrayList<>();

    try {
      do {
        System.out.println("Give date:");
        dateFromUser = scanner.nextLine();
        Date date = new Date(dateFromUser);
        expenses = new ArrayList<>();

        do {
          System.out.println("Give category:");
          String category = scanner.nextLine();
          System.out.println("Give sum:");
          Double sum = scanner.nextDouble();
          scanner.nextLine();
          System.out.println("Give description:");
          String description = scanner.nextLine();

          expenses.add(new Expense(category, sum, description));

          System.out.println("Give more expenses:? (y/n)");
          answer = scanner.nextLine();

          while (!answer.equals("y") && !answer.equals("n")) {
            System.out.println("Enter y or n");
            answer = scanner.nextLine();
          }
        } while (answer.equals("y"));

        dailyExpenses.put(date, expenses);
        System.out.println("Give more dates? (y/n)");
        answer = scanner.nextLine();

      } while (answer.equals("y"));
    } catch (Exception e) {
      System.out.println("Error");
    }
  }

  // Print all given dates and their expenses
  public static void printExpenses(HashMap<Date, ArrayList<Expense>> dailyExpenses) {
    System.out.println("All expenses:");

    for (HashMap.Entry<Date, ArrayList<Expense>> map : dailyExpenses.entrySet()) {
      System.out.println(map.getKey());
      ArrayList<Expense> expensesFromMap = map.getValue();

      for (Expense e : expensesFromMap) {
        System.out.println(e.toString());
      }

      System.out.print("\n");
    }
  }
}
