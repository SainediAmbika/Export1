import java.util.Scanner;

public class Practice1 {
public static void main(String[] args) {
	/*Find the max of 3 numbers*/
	//1st Method
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the a value:");
	int a=s.nextInt();
	System.out.println("Enter the b value:");
	int b=s.nextInt();
	System.out.println("Enter the c value");
	int c=s.nextInt();
	int max;
	if(a>b)
	{
		if(a>c) 
		{
			max=a;
		}
		else {
			max=c;
		}
	}
	else {
		if(b>c)
		{
			max=b;
		}
		else
		{
			max=c;
		}
		}
	System.out.println("The maximum number of three numbers are:"+max);
	}
}
//2nd Method
	/*Scanner s=new Scanner(System.in);
	System.out.println("Enter the a value:");
	int a=s.nextInt();
	System.out.println("Enter the b value:");
	int b=s.nextInt();
	System.out.println("Enter the c value");
	int c=s.nextInt();
	int max;
	if(a>b)
	{
		if(a>c) 
		{
			max=a;
		}
		else {
			max=c;
		}
	}
	else {
		if(b>c)
		{
			max=b;
		}
		else
		{
			max=c;
		}
		}
	System.out.println("The maximum number of three numbers are:"+max);
	}
	}
	*/
