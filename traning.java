import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class traning {

  public static void main(String[] args) throws InterruptedException {
    Date today = new Date();
    System.out.println(today);
    Calendar cal = Calendar.getInstance();
    cal.set(2022, 12, 14, 23, 51, 0);

    while (today.before(cal.getTime()))
      {
      System.out.println("waiting");
      Thread.sleep(1000);
      today = new Date();
      System.out.println(today);
      }
    System.out.println("Done!");
Arrays.sort(arr);
   
  }
}