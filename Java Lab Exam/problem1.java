import java.util.Scanner;
public class problem1 {
	public static void main(String m[])
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = Integer.toString(n);
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i)+"   ");
		}
		
	}
}
