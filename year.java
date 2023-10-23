import static org.junit.assert.assertTrue;
import java.until.scanner;
public class year
{
       public static void main(string args[])
	   {
	          int m,year,week,day;
			  scanner s=new scanner(system.in);
			  system.out.print("enter the number of days:");
			  m=s.nextint();
			  year=m/365;
			  assertTrue(2==year);
			  m=m%365;
			  system.out.println("no.of years:"+year);
			  week =m/7;
			  m=m%7;
			  system.out.printl("no.of weeks:"+week);
			  day=m;
			  system.out.println("no.of days:"+day);}
			  }
			  
			