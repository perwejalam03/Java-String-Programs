import java.util.Scanner;
public class Anagram 
{
	static boolean isanagram(String st1,String st2)
	{
		int [] count1=noOfOccurance(st1);
		int [] count2=noOfOccurance(st2);
		for(int i=0;i<count1.length;i++)
		{
			if(count1[i]!=count2[i])
				return false;
		}
		return true;
	}
	static int [] noOfOccurance(String st)
	{
		int[]  count=new int[26];
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>='A'&&ch<='Z') 
			{
				count[ch-65]++;
			}
			if(ch>='a'&&ch<='z')
				count[ch-97]++;
		}
		return count;
	}
	public static void main(String[] args) {
		Anagram an=new Anagram();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string:");
		String s1=sc.nextLine();
		System.out.println("Enter the second String:");
		String s2=sc.nextLine();
		boolean rs=an.isanagram(s1,s2);
		if(rs)
			System.out.println(s1+ "and "+s2 + " are anagram ");
		else
			System.out.println(s1+ "and "+s2 + " are not anagram ");
	}
}
