package program;
import java.util.*;
public class h23 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String a;
long fial=0,b,lengtha1=0,length=0,lengtha2=0;
long take=0,take1=0;
a=sc.nextLine();
length=a.length();
char at[]=new char[1000000];
b=sc.nextLong();
for(int i=0;i<a.length();i++)
{
	at[i]=a.charAt(i);
}
for(int i=0;i<a.length();i++)
{
	if((int)at[i]==97)
	{
lengtha1++;
}
}
take=b/length;
take1=b%length;
for(int i=0;i<take1;i++)
{
	if(at[i]==97)
	{
		lengtha2++;
	}
}
fial=take*lengtha1+lengtha2;
System.out.println(fial);
	}

}
