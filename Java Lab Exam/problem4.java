class Date
{
	int day,month,year;
	public Date(int day, int month, int year)
	{
		if(day<=32 && day>=0)
		{
			this.day=day;
		}
		else
		System.out.println("Invalid date");
		if(month<13 && month>0)
		{
			this.month=month;
		}
		else
		System.out.println("Invalid month");
		if(year <=0)
		{
			System.out.println("Invalid Year");
		}
		else
		this.year=year;
		
	}
	public void setDay(int day)
	{
		if(day<32 && day>0)
		{
			this.day=day;
		}
		else
		System.out.println("Invalid date");
	}
	public int getDay()
	{
		return day;
	}
	public void setMonth(int month)
	{
		if(month<13 && month>0)
		{
			this.month=month;
		}
		else
		System.out.println("Invalid month");
	}
	public int getMonth()
	{
		return month;
	}
	public void setYear(int year)
	{
		if(day<32 && day>0)
		{
			this.day=day;
		}
		else
		System.out.println("Invalid date");
	}
	public int getYear()
	{
		return year;
	}
	public void displayDate()
	{
		if(day!=0 && month !=0 && year !=0){
		System.out.println("The Date is ");
		System.out.println(day + "/" + month +"/" +year);}
		
		else System.out.println("Insert a correct date");
	}
}
public class displayDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date ob = new Date(21,3,2018);
		ob.displayDate();
		Date ob1 = new Date(12,66,2015);
		ob1.displayDate();
	}

}
/*
The Date is 
21/3/2018
Invalid month
Insert a correct date
*/
