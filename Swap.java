import java.util.Scanner;
public class Swap 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word:");
		String st=sc.nextLine();
		String s=SwapFLChar(st);
		System.out.println("After swapping :"+s);
	}
	static String SwapFLChar(String st)
	{
		int f=0;
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				f=i;
			}
			else if(ch[i]!=' '&&i==ch.length-1|| ch[i]!=' '&&ch[i+1]==' ')
			{
				char t=ch[i];
				ch[i]=ch[f];
				ch[f]=t;
			}
		}
		st=new String(ch);
		return st;
	}
}
