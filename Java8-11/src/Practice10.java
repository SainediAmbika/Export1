import java.util.Scanner;

public class Practice10 {
/*Example of Array Declaration and Instantiate
 * int a[]=new int[2];
 * Initialization of Array
 * a[0]=10;
 * a[1]=20;
 * user defined-Object Array
 * class A{
 * }
 * A array[]=new A[5]; We can create array with className also then that array is called as User defined Array/Object Array
 * */
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=s.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter  the element value");
			a[i]=s.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
}
