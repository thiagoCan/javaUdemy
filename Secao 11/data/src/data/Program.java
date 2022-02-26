package data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		
		Date x1 = new Date();
		
		System.out.println(sdf2.format(y1));
		System.out.println(sdf2.format(y2));
		System.out.println("x1: " + sdf2.format(x1));
		
		System.out.println("----------------------------");
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(y1);
		int month = 1 + cal.get(Calendar.MONTH);
		System.out.println("Month: " + month);

	}

}
