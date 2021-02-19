package program;
import java.util.*;
public class h12 {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   long n,a=0,b=0,c=0,take=0,reminder=0;
   long arr[][]=new long[1000][1000];
   n=sc.nextLong();
   for(int i=0;i<n;i++)
   {
	 for(int j=0;j<3;j++)
	   {
		   
	   arr[i][j]=sc.nextLong();
   }}
   for(int i=0;i<n;i++)
   {
	 a=arr[i][0];
	 b=arr[i][1];
	 c=arr[i][2];
	 take=c-1;
	reminder=b%a;
	
	if(a==b)
	{
		System.out.println(a);
	}
	else
	{
	 for(int j=1;j<=reminder;j++)
	 {
		take++; 
	 }}
	 System.out.println(take);
	 a=b=c=0;
	 take=0;
	 reminder=0;
	}
}
}