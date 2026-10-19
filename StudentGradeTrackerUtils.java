import java.util.ArrayList;

public class StudentGradeTrackerUtils {
  public static int getAverage(ArrayList<Integer> grades) {
    int total = 0;

    for (int i = 0; i < grades.size(); i++) {
      total += grades.get(i);
    }
    
    return total / grades.size();
  }

  public static boolean correctGrade(int grade) {
    return grade > 0 && grade <= 100;
  }
}
