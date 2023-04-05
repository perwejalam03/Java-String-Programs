import java.util.Scanner;
public class NoToString 
{
	static void nw(int n,String st)
	{
		String one[]={"","one","two","three","four","five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","thirteen","fourteen","fifteen","Sixteen","Seventeen","Eightteen","Nineteen"};
		String two[]={" "," ","Twenty","thirty","fouty","fifty","Sixty","Sevety","Eighty","ninty"};
  
		if(n<20)
		System.out.print(one[n]);
		else
		System.out.print(two[n/10]+one[n%10]);
		if(n!=0)
		System.out.print(st+" ");
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int n=sc.nextInt();
		nw(n/10000000,"crore");
		nw(n/100000%100,"lakh");
		nw(n/1000%100,"Thousand");
		nw(n/100%10,"hundred");
		nw(n%100," ");
	}
}