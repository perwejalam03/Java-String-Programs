import java.util.Scanner;
public class VowelCapConsoSmall
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String st=sc.nextLine();
		String s=CheckVowelConso(st);
		System.out.println(s);
	}

	static String CheckVowelConso(String st)
	{
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
				if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
				{
					if(ch[i]>='a'&&ch[i]<='z')
						ch[i]=(char)(ch[i]-32);
				}
				else if(ch[i]>='A'&&ch[i]<='Z')
				{
					ch[i]=(char)(ch[i]+32);
				}
			
			
		}
		st=new String(ch);
		return st;
	}
	
}
