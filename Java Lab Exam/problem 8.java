import java.util.Scanner;
public class palindromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, temp, length , reminder;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = Integer.toString(n);
		length = s.length();
			if(length >= 0 && length <=5 )
			{
				temp=n;
				while(n>0)
				{
					   reminder=n%10;  //getting remainder  
					   sum=(sum*10)+reminder;    
					   n=n/10;
				}
				if(temp==sum)
				{
					System.out.println("It's a palindrome");
				}
				else
				{
					System.out.println("It's not a palindrome");
				}
			}
			else
			{
				System.out.println("Length must me greter than 0 and less 0r equal to 5");
			}
		}
		
	}

/*
12321
It's a palindrome

*/
