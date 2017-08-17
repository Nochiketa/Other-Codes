class Employee
{
	String first_name;
	String last_name;
	double monthly_salary;
	
	public Employee(String first_name, String last_name, double monthly_salary)
	{
		this.first_name = first_name;
		this.last_name = last_name;
		this.monthly_salary = monthly_salary;
	}
	
	public void getFirstName(String first_name)
	{
		this.first_name = first_name;
	}
	public String setFirstName()
	{
		return first_name;
	}
	public void getlastName(String last_name)
	{
		this.last_name = last_name;
	}
	public String setlastName()
	{
		return last_name;
	}
	public double monthly_salary()
	{
		if(monthly_salary>0)
		{
			return monthly_salary;
		}
		else return 0.0;
			
	}
	
}
public class EmployeeTest {
	public static void main(String args[])
	{
		Employee ob= new Employee("Noor ", "Hossain", 50000);
		Employee ob1 = new Employee("Jamal ", "Sheikh", 60000);
		
		System.out.print("Employee1's name: ");
		System.out.print(ob.setFirstName());
		System.out.println(ob.setlastName());
		System.out.print("Employee1's salary: ");
		System.out.println(ob.monthly_salary()*12);
		
		System.out.print("Employee1's name: ");
		System.out.print(ob1.setFirstName());
		System.out.println(ob1.setlastName());
		System.out.print("Employee1's salary: ");
		System.out.println(ob1.monthly_salary()*12);
		
		double obYearlySalary = (ob.monthly_salary()*12)*.1;
		double ob1YearlySalary = (ob1.monthly_salary()*12)*.1;
		
		System.out.println("Afer a 10% raise Employee1's yearly salary "+obYearlySalary*12);
		System.out.println("Afer a 10% raise Employee2's yearly salary "+ob1YearlySalary*12);
	}
}
