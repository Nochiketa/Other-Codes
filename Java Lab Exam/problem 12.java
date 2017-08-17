/*
 (Rectangle Class) Create a class Rectangle with attributes length and width, each of which defaults to 1. 
 Provide methods that calculate the rectangle’s perimeter and area. It has set and get methods for both 
 length and width. The set methods should verify that length and width are each floating-point numbers larger
  than 0.0 and less than 20.0.Write a program to test class Rectangle.
 */


class Rectangle
{
	double height;
	double width;
	Rectangle(double height, double width)
	{
		if(height>0.0 && height<=20.0)
		{
			this.height = height;
		}
		else System.out.println("Invalid Height");
		
		if(width>0.0 && width<=20.0)
		{
			this.width = width;
		}
		else System.out.println("Invalid width");
	}
	public void setheight(int height)
	{
		if(height>0.0 && height<=20.0)
		{
			this.height = height;
		}
		else System.out.println("Invalid Height");
	}
	public double getheight()
	{
		return height;
	}
	public void width(int width)
	{
		if(width>0.0 && width<=20.0)
		{
			this.width = width;
		}
		else System.out.println("Invalid width");
	}
	public double setwidth()
	{
		return width;
	}
	public void perimeter()
	{
		if(height>0.0 && height<=20.0 && width >0.0 && width <= 20.0){
		System.out.println("The perimeter of the rectangle is: ");
		System.out.println(2*(height+width));}
		else System.out.println("Height or Width is not Correct");
	}
	public void area()
	{
		if(height>0.0 && height<=20.0 && width >0.0 && width <= 20.0){
		System.out.println("The area of the rectangle is: ");
		System.out.println(height*width);}
		else System.out.println("Height or Width is not Correct");
	}
}
public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle ob = new Rectangle(6,0);
		ob.perimeter();
		ob.area();
	}

}
