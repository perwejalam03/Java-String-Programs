import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence ");
		String s=sc.nextLine();
		String fs=Firstchar(s);
		System.out.println(fs);
	}
	static String Firstchar(String str)
	{
		char [] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==ch.length-1 && ch[i]!=' ' || ch[i]!=' '&& ch[i+1]==' ')
			{
				if(ch[i]>='a'&&ch[i]<='z')
				{
					
					ch[i]=(char)(ch[i]-32);
				}
			}
		}
		String s=new String(ch);
		return s;
	}
}
