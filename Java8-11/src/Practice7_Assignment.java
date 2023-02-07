
public class Practice7_Assignment {
	/*Input=xHexxlxlox
	 * Print=xHellox*/
		public static void main(String[] args) {
			String s1="xHexxlxlox";
			String s2=s1.substring(0,1);
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
			System.out.println(s2+result+s2);
		}
}