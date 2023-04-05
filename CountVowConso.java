import java.util.Scanner;
public class CountVowConso {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String str=sc.nextLine();
		int vc=0,cc=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
			{	
				if(ch=='A'||ch=='E'|| ch=='I'||ch=='O'||ch=='U'|| ch=='a' || ch=='e' || ch=='i'  || ch=='o' || ch=='u' )
					vc++;
				else
					cc++;
			}
		}
		System.out.println("Vowel present in the Sentence is:"+vc);
		System.out.println("Consonent present in the Sentence is:"+cc);
	}
}
