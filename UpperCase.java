import java.util.Scanner;
public class UpperCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word:");
		String str=sc.nextLine();
		String s=uppercase(str);
		System.out.println("upper case"+s);
	}
	static String uppercase(String st)
	{
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a'&&ch[i]<='z')
			{
				ch[i]=(char)(ch[i]-32);
			}
			
		}
		String st1=new String(ch);
		return st1;
	}
}
