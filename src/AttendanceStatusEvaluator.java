import java.util.Scanner;
public class AttendanceStatusEvaluator {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter The Attendance: ");
    int Attendance = sc.nextInt();
    if(Attendance < 60){
      System.out.println("poor");
    }else if (Attendance >= 60 && Attendance <=80){
      System.out.println("satisfactory");
    }else if (Attendance > 80){
      System.out.println("Excellent");
    }
  }
}
