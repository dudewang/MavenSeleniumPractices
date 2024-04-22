package seleniumTestcases;

import java.util.Calendar;

public class DemoHandleJQueryCal {

	
	static int currentDay, currentMonth, currentYear;
	static int targetDay, targetMonth, targetYear;
	static int jumpBy;
	static boolean increment = true;
	
	static String dateToSet = "23/12/2023";
	
	
	static void getCurrentDayMonthYear()
	{
		Calendar cal = Calendar.getInstance();
		currentDay = cal.get(Calendar.DAY_OF_MONTH);
		currentMonth = cal.get(Calendar.MONTH)+1;
		currentYear = cal.get(Calendar.YEAR);
		
		System.out.println(currentDay+" "+currentMonth+" "+currentYear);
		
		
	}
	
	static void getTargetDayMonthYear(String date)
	{
		int beginIndex = date.indexOf("/");
		int lastIndex = date.lastIndexOf("/");
		String s = date.substring(0, beginIndex);
		targetDay = Integer.parseInt(s);
		
		String s2 = date.substring(beginIndex+1, lastIndex);
		targetMonth = Integer.parseInt(s2);
		
		String s3 = date.substring(lastIndex+1);
		targetYear= Integer.parseInt(s3);		
		
		System.out.println(targetDay+" "+targetMonth+" "+targetYear);
		
	}
	
	static void getMonthJump()
	{
		if((targetMonth-currentMonth) > 0)
		{
			jumpBy = targetMonth-currentMonth;
		}
		else if((targetMonth-currentMonth)<0)
		{
			jumpBy = currentMonth-targetMonth;
			increment = false;
		}
		else
		{
			increment = false;
		}
	}
	public static void main(String[] args) {
		

		getCurrentDayMonthYear();
		getTargetDayMonthYear(dateToSet);
	}

}
