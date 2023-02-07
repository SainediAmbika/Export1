
public class Practice13_Assignment {
/*Input:66525671
 * Output:2*/
	public static void main(String[] args) {
		String s1="66525671";
		int count=0;
		for(int i=0;i<s1.length()-1;i++)
		{
			if(s1.substring(i, i+2).equals("66")||s1.substring(i, i+2).equals("67"))
			{
				count++;
			}
		}
		System.out.println(count);
		}
	}