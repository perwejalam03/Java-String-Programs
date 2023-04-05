import java.util.Scanner;
public class Pangram 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String value ");
		String st=sc.nextLine();
		boolean rs=ispanagram(st);
		if(rs)
			System.out.println("The String is panagram ");
		else
			System.out.println("The string is not a panagram ");
	}
	static boolean ispanagram(String st)
	{
		int [] count=new int[26];
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>='A'&& ch<='Z')
				count[ch-65]++;
			else if(ch>='a'&&ch<='z')
				count[ch-97]++;
		}
		for(int i=0;i<count.length;i++)
		{
			//System.out.println((char)(i+65)+" --> "+ count[i]);
			if(count[i]==0)
				return false;
		}
		return true;
	}
}
