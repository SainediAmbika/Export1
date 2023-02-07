
public class Practice9_Assignment {
	/*Input="Helloworld"
	 * Output"Hellorld*/
	public static void main(String[] args) {
		String s1="Helloworld";
		String s2=s1.substring(0,5);
		String s3="rld";
		int a=s1.indexOf(s3);
		if(a>0)
		{
			System.out.println(s2+s3);
		}
		else
		{
			System.out.println("False");
		}
		
	}

}
