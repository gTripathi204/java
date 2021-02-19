package program;
import java.util.*;
import java.math.*;
import java.util.Arrays;
import java.util.List;
public class h22 {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n,k,x=0;
int arr[]=new int[10000];

n=sc.nextInt();
k=sc.nextInt();
int arr1[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}


int p=0;
for(int i=0;i<n;i++)
{
	for(int j=i+1;j<n;j++)
	{
		if(Math.addExact(arr[i], arr[j])%k!=0)
			
		{
			
		if(notcontains(arr1,arr[i]))
			 arr[p]=arr[i];
		 System.out.println(arr[p]);
		 p=p+1;
		}
	}
}
	
for(int i=0;i<n;i++)
	{
		System.out.println(arr1[i]);
	}

	
	}



	private static boolean notcontains(int[] arr1, int i) {
		// TODO Auto-generated method stub
		return false;
	}



	
	}
