import java.util.Scanner;

class Solution {

  public void whichWeekDay(int day) {
    if (day > 7 || day < 1) {
      System.out.println("Invalid Day Value");
    }

    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
    }

  }

}

class _01_Switch_Case {

  public static void main(String[] args) {
    // Creating an instance of Solution class
    Solution sol = new Solution();

    Scanner scanner = new Scanner(System.in);
    int day;
    // Taking user input
    System.out.print("Enter the day number: ");
    day = scanner.nextInt();

    /*
     * Function call to determine the day
     * of the week based on day number
     */
    sol.whichWeekDay(day);
    scanner.close();
  }
}
