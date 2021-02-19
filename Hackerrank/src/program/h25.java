package program;
import java.util.*;
public class h25 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a,c,b;

int mostpresent=0,take=0;
a=sc.nextInt();

int arr1[]=new int[a];
for(int i=0;i<a;i++)
{
	arr1[i]=sc.nextInt();
}
b=arr1.length;
for(int i=0;i<a;i++)
{
	for(int j=i+1;j<a;j++)
	{
		if(arr1[i]==arr1[j])
		{
			take++;
		}
				
	}
	
	if(take>mostpresent)
	{
		mostpresent=take;
	}
	take=0;
}

c=mostpresent+1;
System.out.println(b-c);
	}

}
