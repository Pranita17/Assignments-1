package module_11;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Question_4 {
	
	
	static String backDate(String strDate) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(strDate);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, -20);
	    System.out.println("20 months before "+strDate+" will be "+ cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH)+1) + "-" + cal.get(Calendar.DATE));
		return strDate;
	}
	

	public static void main(String[] args) throws ParseException  {
	   
		Scanner scan = new Scanner(System.in);
		String strDate = scan.nextLine();
		backDate(strDate);
		
	  }
	}

