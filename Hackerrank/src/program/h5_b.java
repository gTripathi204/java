package program;
import java.util.Scanner;
public class h5_b {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int arr[]=new int[6000];
char ch[]=new char[5000];
int n,value=0,answer=0,take=0,biggest=0;
String a,choice;
for(int i=0;i<26;i++)
{
	arr[i]=sc.nextInt();
}
a=sc.next();
n=a.length();
for(int i=0;i<a.length();i++)
{
	ch[i]=a.charAt(i);
}
for(int i=0;i<a.length();i++)
{
	value=(int)ch[i];
	answer=value-97;
	take=arr[answer];
	if(take>biggest)
	{
		biggest=take;
	}
}
System.out.println(biggest*n);
	
	}
}
