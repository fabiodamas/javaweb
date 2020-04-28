package io.github.fabiodamas.Cap1_BaseDados;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Teste {
	public static void main(String[] args) {
		try {
			String stringDate="23-06-2010";
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
			Date date;
			date = formatter.parse(stringDate);
			Calendar calender = Calendar.getInstance();
			calender.setTime(date);
			
			// System.out.println(calender.get);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
