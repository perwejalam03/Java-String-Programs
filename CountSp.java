import java.util.Scanner;
public class CountSp {
	static int Countsp(String st)
	{
		int count=0;
		for(int i=0;i<=st.length();i++)
		{
			char ch=st.charAt(i);
			if((ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'||ch>='0'&&ch<='9')==false)
				count++;
		}return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=sc.nextLine();
		int sp=Countsp(str);
		System.out.println("The count of special character is:"+sp);
	}

}
