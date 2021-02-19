
// unsolved
package program;
import java.util.*;
import java.util.stream.*;
import java.math.*;
public class h21 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a,small=0,temp=0,sum=0;
int arr[]=new int[10000];
a=sc.nextInt();
for(int i=0;i<a;i++)
{
	arr[i]=sc.nextInt();
}
for(int i=0;i<a;i++)
{
	for(int j=i;j<a;j++)
	{
		if(arr[i]>arr[j])
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
for(int i=0;i<a;i++)
{
	if(arr[i]!=0)
	{
	small=arr[i];
	}
	if(small!=0)
	{
		for(int j=i;j<a;j++)
		{
			
	arr[i]=arr[i]-small;
	sum=
	}
	}
}

	
	}
}
	


	
	