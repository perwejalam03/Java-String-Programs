import java.util.Scanner;
public class CountWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String st=sc.nextLine();
		int wc=WordCount(st);
		System.out.println("The word present in the sentence is:"+wc);
	}
	static int WordCount(String st)
	{
		int count=0;
		char [] ch=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if( i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
				count++;
		}
		return count;
	}

}
