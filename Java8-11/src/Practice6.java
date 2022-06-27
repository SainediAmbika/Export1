
public class Practice6 {
/*Input=xHexxlxlox
 * Print=Hello*/
	public static void main(String[] args) {
		String s1="xHexxlxlox";
		String result="";
		for(int i=0;i<=s1.length()-1;i++)
		{
			if(s1.charAt(i)=='x')
			{
				continue;
			}
			else
			{
				result=result+s1.charAt(i);
			}
		}
		System.out.println(result);
	}
}
