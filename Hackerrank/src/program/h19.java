package program;
import java.util.*;
import java.math.*;
public class h19 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n,m=0;
int a=0,b=0;
double take=0.0;
n=sc.nextInt();
int arr[][]=new int[10000][10000];
for(int i=0;i<n;i++)
{
	for(int j=0;j<2;j++)
	{
		arr[i][j]=sc.nextInt();
	}
}
for(int i=0;i<n;i++)
{
	a=arr[i][0];
	b=arr[i][1];
	for(int j=1;j<=b;j++)
	{
				
		take=j*j;
		if(take>=a && take<=b)
		{
			m++;
		}
		else if(take>b)
		{
			break;
		}
		
	}
	System.out.println(m);
	m=0;
	}
	}

}



	


