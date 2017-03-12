//Super is used to refer immediate parent class instance variable,
//invoke immediate parent class method,invoke immediate parent class constructor

class One
{
	int i = 1;
	void p()
	{
		System.out.println("The value here is one");
	}
	One()
	{
		System.out.println("Value is created");
	}
}
class Two extends One
{
	int Three = 3;
	void print()
	{
		System.out.println(super.i);
		super.p();
	}
	Two()
	{
		super();
	}
}
public class UseSuper {
	public static void main(String arg[])
	{
		Two ob = new Two();
		ob.print();
	}
}

//Copy Code from JavaTPoint
/*
class Animal{  
String color="white";  
}  
class Dog extends Animal{  
String color="black";  
void printColor(){  
System.out.println(color);//prints color of Dog class  
System.out.println(super.color);//prints color of Animal class  
}  
}  
class TestSuper1{  
public static void main(String args[]){  
Dog d=new Dog();  
d.printColor();  
}}  */
