// Solved


package program;
import java.util.*;
import java.math.*;
public class h27 {
	public static void biggest(int[] arr,int l)
	{
		int max,number,x=0;
		Arrays.sort(arr);
		max=arr[l-1];
		System.out.println(max);
		for(int i=0;i<l;i++)
		{
			if(arr[i]==max)
				x++;
		}
		System.out.println(x);
		
		
		
	}
		
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	int n,m,take=0;
	n=sc.nextInt();
	m=sc.nextInt();
	
	char ch[][]=new char[501][501];
	String ab[]=new String[n];
	for(int i=0;i<n;i++)
	{
		ab[i]=sc.next();
	}
	
	for(int i=0;i<n;i++)
		take=take+i;
	int sum[]=new int[take];
	
	for(int i=0;i<n;i++)
	{
	for(int j=0;j<m;j++)
	{
		ch[i][j]=ab[i].charAt(j);
	}
	}
	
///////
	int f=0;
	int p=0;
	for(int i=0;i<n-1;i++) {
	for(int k=i+1;k<n;k++) {
	for(int j=0;j<m;j++)
	{
		if(ch[i][j]=='1' || ch[k][j]=='1')
		{
		f++;
			
		}
		}
	
	
	sum[p]=f;
	p++;
	f=0;
	}
	}
	biggest(sum,take);
	
		
	
}
	}
	


