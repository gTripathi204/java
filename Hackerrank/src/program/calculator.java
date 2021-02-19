package program;
import java.util.*;
import java.math.*;
public class calculator {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int arr[]=new int[100000];
int a,b=0;
a=sc.nextInt();
for(int i=0;i<a;i++)
{
	arr[i]=sc.nextInt();
}
for(int i=0;i<a;i++)
{
	b+=arr[i];
}
System.out.println(b);
	}

}
