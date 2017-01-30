package Deitel;
import java.util.Scanner;
public class knowYourAge {
	public static void main(String arg[])
	{
		int day, month , year, dayToday, monthToday, yearToday, ageDay, ageMonth, ageYear;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter today's date: ");
		dayToday = scan.nextInt();
		monthToday = scan.nextInt();
		yearToday = scan.nextInt();
		
		System.out.println("Enter your birthdate ");
		day = scan.nextInt();
		month = scan.nextInt();
		year = scan.nextInt();
		
		
		
		if(day>dayToday)
		{
			dayToday+=30;
			ageDay = dayToday - day;
			month = month+1;
		}
		else 
		{
			ageDay = dayToday - day;
		}
		
		if(month>monthToday)
		{
			monthToday+=12;
			ageMonth = monthToday - month;
			year = year+1;
		}
		else 
		{
			ageMonth = monthToday - month;
		}
		
		ageYear = yearToday - year;
		
		System.out.printf("Your age is %d years, %d months, %d days\n", ageYear, ageMonth, ageDay);
		System.out.println("Your age is "+ageYear+" years");
	}
}
