package program;
import java.util.*;
public class h14 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a=0,b=0,c=0;
int arr[]=new int[100000];
int collect[]=new int[100000];
a=sc.nextInt();
for(int i=0;i<a;i++)
{
	arr[i]=sc.nextInt();
	}
for(int i=1;i<=a;i++)
{
	for(int j=0;j<a;j++)
	{
		if(i==arr[j])
		{
			b=j+1;
		}
	}
	for(int j=0;j<a;j++)
	{
		if(arr[j]==b)
		{
			c=j+1;
		}
	}
	System.out.println(c);
	b=0;
	c=0;
	
	
}
	}

}
