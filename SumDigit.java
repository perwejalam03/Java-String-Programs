import java.util.Scanner;
public class SumDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String str=sc.nextLine();
		int sm=sumofDigits(str);
		System.out.println("The sum is"+sm);
	}
	static int sumofDigits(String st)
	{
		int sum=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>=48 && ch<=57)
				sum=sum+(ch-48);
		}
		return sum;
	}

}
