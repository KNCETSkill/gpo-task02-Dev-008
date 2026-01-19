import java.util.Scanner;
public class AttendanceStatusEvaluator{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print();
    int Attendance = sc.nextInt();
    if(Attendance<60){
      System.out.print("Poor");
    }else if (Attendance>=60&&Attendance<=85){
      System.out.print("Satisfactory");
    }else if (Attendance>85){
      System.out.print("Excellent");
    }
  }
}
