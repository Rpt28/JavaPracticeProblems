package basic;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateAndTime {

	public static void main(String[] args) {
		int day, month, year, second, minute, hour;
		GregorianCalendar gc = new GregorianCalendar();

		day = gc.get(Calendar.DAY_OF_MONTH);
		month = gc.get(Calendar.MONTH);
		year = gc.get(Calendar.YEAR);
		second = gc.get(Calendar.SECOND);
		minute = gc.get(Calendar.MINUTE);
		hour = gc.get(Calendar.HOUR);

		System.out.println("Current Date is " + day + "-" + (month+1) + "-" + year);
		System.out.println("Current Time is " + hour + ":" + minute + ":" + second);
	}

}
