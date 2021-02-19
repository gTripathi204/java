package program;
import java.util.*;
public class Take {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int k,take=0;
k=sc.nextInt();
int arr[]=new int[10000];
for(int i=0;i<k;i++)
{
	arr[i]=sc.nextInt();
	
}
int p=0;
while(p<k-1)
{
if(arr[p]==0)
{
	if(arr[p+2]==0)
	{
		take++;
		p=p+2;
	}
	else if(arr[p+1]==0)
	{
		take++;
		p++;
	}
	
}
else {}
}
System.out.println(take);

	}

}

