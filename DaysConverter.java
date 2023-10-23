import java.util.Scanner;

public class DaysConverter {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter number of days: ");
    int days = scanner.nextInt();
    
    int years = days / 365;
    days = days % 365;
    
    int weeks = days / 7;
    days = days % 7;
    
    System.out.println(days + " days = " + years + " years, " + weeks + " weeks, " + days + " days");
    
  }

}