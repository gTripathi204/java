package program;
import  java.util.Scanner;
import java.math.*;
public class h6 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a,n,temp=0,take=0;
int arr[]=new int[100000];
n=sc.nextInt();
a=sc.nextInt();
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
for(int i=0;i<n-1;i++)
{
	if(arr[i]>arr[i+1])
	{
		temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
	}
}
take=arr[n-1];
System.out.println(take-a);
	}

}
