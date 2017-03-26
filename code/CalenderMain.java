package edu.nyu.objects;

public class CalenderMain{
	public static void main(String[] args) {
		Calender calender=new Calender();
		MyBirthday mybirthday=new MyBirthday("Spandhana",calender );
		calender.setMonth(05);
		calender.setDay(22);
		calender.setYear(18);
		mybirthday.greeting();
		//System.out.println(calender);
		
	}

}
