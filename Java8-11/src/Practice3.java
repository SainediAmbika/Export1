import java.util.Scanner;

public class Practice3 {
/*Find near to 100 or 200 in the range of 10*/
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the a value:");
		int a=s.nextInt();
		int n=Math.abs(100-a);
		int m=Math.abs(200-a);
		if((n>=1&&n<=10)||(m>=1&&m<=10))
		{
			System.out.println("The given number "+a+" is in the given range");
		}
		else
		{
			System.out.println("The given number "+a+" is not in the given range");
		}
	}
}
