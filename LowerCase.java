import java.util.Scanner;
public class LowerCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word:");
		String str=sc.nextLine();
		String s=lowercase(str);
		System.out.println("Lower case"+s);
	}
	static String lowercase(String st)
	{
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
			}
			
		}
		String st1=new String(ch);
		return st1;
	}
}
