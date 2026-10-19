import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentGradeTracker {
  public static void main(String[] args) throws Exception {
    ArrayList<String> names = new ArrayList<>();
    ArrayList<Integer> grades = new ArrayList<>();

    boolean running = true;
    int choice = 0;
    String name = "";
    int grade = 0;
    Scanner sc = new Scanner(System.in);

    while (running) {
      System.out.println("\n1. Add a new student and grade \n" +
          "2. View all students and their grades \n" +
          "3. Calculate the class average \n" +
          "4. Quit the program \n");

      // Simple choice nextInt
      System.out.print("Choose an option: ");

      while (true) {
        try {
          choice = sc.nextInt();
          break;
        } catch (InputMismatchException e) {
          System.out.println("Please add a NUMBER");
          System.out.println("Try again: ");
          sc.nextLine();
        }
      }
      sc.nextLine();

      switch (choice) {
        case 1:
          System.out.println("Add the name of the student: ");
          name = sc.nextLine();

          System.out.println("Add a grade (between 0 - 100): ");

          grade = sc.nextInt();

          names.add(name);
          grades.add(grade);
          break;
        case 2:
          System.out.println("Students: " + names);
          System.out.println("Grades: " + grades);
          break;
        case 3:
          if (grades.isEmpty()) {
            System.out.println("\nNo grades");
            break;
          }

          if (grades.size() == 1) {
            System.out.println("\nThe class average is: " + grades.get(0));
            break;
          }

          // System.out.println("\nThe class average is: " + average);
          System.out.println("\nThe class average is: " + StudentGradeTrackerUtils.getAverage(grades));

          break;
        case 4:
          System.out.println("\nExiting");
          running = false;

        default:
          System.out.println("\nInvalid choice");
          break;
      }
    }

    sc.close();
  }
}