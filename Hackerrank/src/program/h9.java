package program;
import java.util.*;
public class h9 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n,a,b,add = 0,x=0,y=0;
int arr[][]=new int[1000][1000];
int number[]=new int[1000];
int take[]=new int[1000];
n=sc.nextInt();
for(int i=0;i<n;i++)
{
	number[i]=sc.nextInt();
    take[i]=sc.nextInt();
	for(int j=0;j<number[i];j++)
	{
		arr[i][j]=sc.nextInt();
	}
	
}
for(int i=0;i<n;i++)
{
	for(int j=0;j<number[i];j++)
	{
	if(arr[i][j]<=0)
	{
		x+=1;
	}
	else {
		y+=1;
	}
   	}
	if(x>=take[i])
	{
		System.out.println("NO");
	}
	
	else
	{
		System.out.println("YES");
	}
   x=0;
   y=0;
}
}}