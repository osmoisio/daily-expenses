package daily_expenses;

public class Expense {
  private String category;
  private double sum;
  private String description;

  public Expense(String category, double sum, String description) {
    this.category = category;
    this.sum = sum;
    this.description = description;
  }

  public Expense() {
  }

  public String toString() {
    return category + ", " + sum + ", " + description;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public double getSum() {
    return sum;
  }

  public void setSum(double sum) {
    this.sum = sum;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
