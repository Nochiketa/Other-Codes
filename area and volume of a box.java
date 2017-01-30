package javaLab;
import java.util.Scanner;
class box {
	int width;
	int height;
	int depth;
	void volume(int w, int h, int d)
	{
		System.out.printf("The volume of the box is %d\n", w*h*d);
	}
	void area(int h, int w)
	{
		System.out.printf("The area of the box is %d", h*w);
	}
}
public class areaVolume {
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		box b1 = new box();
		System.out.println("Enter the width, height and depth of the box");
		b1.width = scan.nextInt();
		b1.height = scan.nextInt();
		b1.depth = scan.nextInt();
		b1.volume(b1.width, b1.height, b1.depth);
		b1.area(b1.height, b1.width);
	}
}
