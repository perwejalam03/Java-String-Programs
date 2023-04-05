import java.util.Scanner;
public class RevWord 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word:");
		String st=sc.nextLine();
		String s=reverseWord(st);
		System.out.println("After Reversing :"+s);
	}
	static String reverseWord(String st)
	{
		char ch[]=st.toCharArray();
		st="";
		for(int i=0;i<ch.length;i++)
		{
			int k=i;
			while(i<ch.length&&ch[i]!=' ')
			{
				i++;
			}
			int j=i-1;
			while(j>=k)
			{
				st=st+ch[j];
				j--;
			}
			if(i<ch.length)
			{
				st=st+ch[i];
			}
		}
		return st;
	}
}
