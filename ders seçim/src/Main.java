import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
      System.out.println("=====Ders Listesi=====");
      System.out.println("M: Matematik");
      System.out.println("F: Fizik");
      System.out.println("K: Kimya");
      System.out.println("B: Biyoloji");
      String [] lessonList=new String[2];
      System.out.println("ders 1: ");
      String firstLesson=scan.nextLine();
      System.out.println("ders 2: ");
      String secondLesson=scan.nextLine();



      switch (firstLesson){
          case "M":
              lessonList[0]="matematik";
              break;
          case "F":
              lessonList[0]="fizik";
              break;
          case "K":
              lessonList[0]="kimya";
              break;
          case "B":
              lessonList[0]="biyoloji";
          default:
              System.out.println("gecersiz ders girildi");
        }
        switch (secondLesson){
            case "M":
                lessonList[1]="matematik";
                break;
            case "F":
                lessonList[1]="fizik";
                break;
            case "K":
                lessonList[1]="kimya";
                break;
            case "B":
                lessonList[1]="biyoloji";
            default:
                System.out.println("gecersiz ders girildi");
        }

        List lessons=new ArrayList<>();
        lessons= Arrays.asList(lessonList);
        System.out.println(lessons);

    }
}
