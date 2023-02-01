package daily_expenses;

public class Date {
  private int day;
  private int month;
  private int year;

  java.time.LocalDate today = java.time.LocalDate.now();

  // Months in array
  public static final String[] MONTHS = { "January", "February", "March", "April", "May", "June", "July", "August",
      "September", "October", "November", "December" };

  // Constructors
  public Date() {
    day = today.getDayOfMonth();
    month = today.getMonthValue();
    year = today.getYear();
  }

  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public Date(String date) {
    String[] parsedDate = date.split("\\.");
    this.day = Integer.parseInt(parsedDate[0]);
    this.month = Integer.parseInt(parsedDate[1]);
    this.year = Integer.parseInt(parsedDate[2]);
  }

  // Compares if two dates are the same, returns boolean
  public boolean onSama(Date date) {
    String date1 = day + "." + month + "." + year;
    String date2 = date.toString();

    if (date1.equals(date2)) {
      return true;
    } else {
      return false;
    }
  }

  // Return date in long format using MONTHS-array
  public String longFormat() {
    return day + ". " + MONTHS[month - 1] + ", " + year;
  }

  // Pass month to method and it returns its number
  public static int numberOfMonth(String s) {
    int numberOfMonth = -1;

    for (int i = 0; i < MONTHS.length; i++) {
      if (s.equalsIgnoreCase(MONTHS[i])) {
        numberOfMonth = i + 1;
      }
    }

    return numberOfMonth;
  }

  public String toString() {
    return (day + "." + month + "." + year);
  }

  // Getters and setters
  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }
}
