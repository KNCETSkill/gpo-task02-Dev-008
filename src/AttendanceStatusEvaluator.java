import java.util.Scanner;
public class AttendanceStatusEvaluator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println();
    int Attendance = sc.nextInt();
    if(Attendance < 60){
      System.out.println("poor");
    }else if (Attendance >= 60 && Attendance <=85){
      System.out.println("satisfactory");
    }else if (Attendance > 85){
      System.out.println("Excellent");
    }
  }
}
