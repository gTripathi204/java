package program;
import java.util.*;
public class Reverse_of_a_number {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a,b,x,rev=0;
	a=sc.nextInt();
	for(int i=a;i<=55;i++)
	{
		x=i;
	while(x>0)
	{
		
		b=x%10;
		rev=rev*10+b;
		x=x/10;
	}
	System.out.println(rev);
   rev=0;

	}
	}
}
