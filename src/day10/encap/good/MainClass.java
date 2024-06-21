package day10.encap.good;

public class MainClass {
	
	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		
//		me.setYear(2025);
		me.setYear(2024);
		
		me.setMonth(12);
		me.setDay(21);
		me.setSsn("123123-1231231");
		
		int year = me.getYear();
		int month = me.getMonth();
		int day = me.getDay();
		String ssn = me.getSsn();
		
		
		System.out.println("년도:" + year);
		System.out.println("월:" + month);
		System.out.println("일:" + day);		
		System.out.println("주민등록번호:" + ssn);
		
		
	}

}
