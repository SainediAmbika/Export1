import java.util.Scanner;

public class Practice2 {
/*If a=10 or b=10 or (a+b)=10 then print true otherwise print false*/
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the a value:");
		int a=s.nextInt();
		System.out.println("Enter the b value:");
		int b=s.nextInt();
		if((a==10)||(b==10)||(a+b)==10)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}
