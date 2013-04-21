import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Problem19 {
	public static void main(String[] args) {
		GregorianCalendar a = new GregorianCalendar();
		
		a.set(1901, 0, 6);
//		System.out.println(a.get(Calendar.DAY_OF_WEEK_IN_MONTH));
//		System.out.println(a.getTime().toString());

		int count=0;
		while(true){
			if (a.get(Calendar.YEAR)==100000) {
				break;
			}
			
			if(Calendar.SUNDAY==a.get(Calendar.DAY_OF_WEEK) && a.get(Calendar.DAY_OF_MONTH) == 1 ){
				count++;
			}
			a.add(Calendar.DATE, 1);
//			System.out.println(a.getTime().toString());
		}
		
		System.out.println("Antall: " + count);
	}
}
