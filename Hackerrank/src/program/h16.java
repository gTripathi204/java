package program;
import java.util.*;
public class h16 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a,b,c,k=0,x=0;
int arr[]=new int[10000];
a=sc.nextInt();
for(int i=0;i<a;i++)
{
	arr[i]=sc.nextInt();
}
for(int i=0;i<a;i++)
{
	c=arr[i];
	while(arr[i]>0)
	{
		
	b=arr[i]%10;
	if(b==0)
	{
		;
	}
	else if(c%b==0)
	{
		k++;
	}
	arr[i]=arr[i]/10;
}
	System.out.println(k);
	k=0;
	
	}
	}

}
