import java.util.Scanner;
public class MainStr1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String str=sc.nextLine();
		int cl=0,sm=0,dc=0,spc=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
				cl++;
			else if(ch>='a'&&ch<='z')
				sm++;
			else if(ch>='0'&& ch<='9')
				dc++;
			else
				spc++;
		}
		System.out.println("The capital letter present in the sentence is:"+cl);
		System.out.println("The small letter present in the sentence is:"+sm);
		System.out.println("The digit present in the sentence is:"+dc);
		System.out.println("The special character present in the sentence is:"+spc);
	}

}
