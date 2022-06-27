
public class Practice11 {
/*Input=abxxcxdxx
 * Output-res=4*/
	public static void main(String[] args) {
		String s1="abxxcxdxx";
		int count=0;
		for(int i=0;i<s1.length()-1;i++)
		{
			if(s1.substring(i,i+2).equals("xx"));
			{
				count++;
		}
	}
		System.out.println(count);		//8
}
}
