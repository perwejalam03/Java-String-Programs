import java.util.Scanner;
public class LastCap 
{
	static String initcap(String st)
	{
		char ch[]=st.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]!=' '&&i==ch.length-1||ch[i]!=' '&&ch[i+1]==' ')
			{
				if(ch[i]>='a'&&ch[i]<='z')
				{
					ch[i]=(char)(ch[i]-32);
				}
			}
			else
			{
				if(ch[i]>='A'&&ch[i]<='Z')
				{
					ch[i]=(char)(ch[i]+32);
				}
				
			}
		}
		st=new String(ch);
		return st;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence.");
		String s=sc.nextLine();
		System.out.println("Aftr conversion");
		String str=initcap(s);
		System.out.println(str);
	}


}
