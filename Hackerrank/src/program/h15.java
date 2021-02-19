package program;
import java.util.*;
public class h15 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int k,n,a,b=100;
int arr[]=new int[10000];
n=sc.nextInt();
k=sc.nextInt();

for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
for(int i=0;i<n;i+=k)
{
	if(arr[i]==0)
	{
		b=b-1;
	}
	else 
	{
		b=b-3;
	}
	System.out.println(b);
	System.out.println(arr[i]);
}

System.out.println(b);





	}

}
