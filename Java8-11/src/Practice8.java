
public class Practice8 {
/*s1="Helloworld" if wo is in the s1 then Print:"woHelloworldwo" otherwise false*/
	public static void main(String[] args) {
		String s1="Helloworld";
		String s2="wo";
		int a=s1.indexOf(s2);
		if(a>0)
		{
			System.out.println(s2+s1+s2);
		}
		else
		{
			System.out.println("False");
		}
	}
}
