package program;
import java.util.*;
import java.math.*;
public class h8 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n,h=1;
int arr[]=new int[10000];
n=sc.nextInt();
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
	
}
for(int i=0;i<n;i++)
{
	if(arr[i]==0)
	{
		System.out.println(h);
	}
	else
	{
		for(int j=1;j<=arr[i];j++)
		{
			if(j%2==0)
			{
				h+=1;
			}
			else 
			{
				h=h+h;
			}
		}
		System.out.println(h);
	}
	h=1;
}




	}

}
