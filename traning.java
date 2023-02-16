
import java.util.Calendar;
import java.util.Date;

// Timer continues until set time
public class traning {

  public static void main(String[] args) throws InterruptedException {
    Date today = new Date();
    System.out.println(today);
    
    Calendar cal = Calendar.getInstance();
    cal.set(2023, 1, 15, 21, 10, 50);    //Year, month, day, Hour, minutes, seconds.
    while (today.before(cal.getTime()))
      {
      System.out.println("waiting");
      Thread.sleep(1000);
      today = new Date();
      System.out.println(today);
      }
    System.out.println("Done!");

   
  }
}