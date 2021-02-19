package program;
import java.util.*;
import java.math.*;
public class Encryption {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String ab;
int length,length1;
double root;
ab=sc.nextLine();
length=ab.length();
char ch[]=new char[81];
char ch1[]=new char[81];
char arr[][]=new char[81][81];


for(int i=0;i<length;i++)
{
	ch[i]=ab.charAt(i);
}
int p=0;
for(int i=0;i<length;i++)
{
	if((int)ch[i]!=32)
	{
		ch1[p]=ch[i];
		p++;
	}
}

///////////
double t=p;
root=Math.sqrt(p);
int x=(int)root;
int s=0;
if(root!=x)
{
	if(x*x+1>=p)
	{
		
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<x+1;j++)
			{
				arr[i][j]=ch1[s];
				s++;
			}
		}
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<x+1;j++)
			{
				if((int)arr[j][i]!=32)
					System.out.print(arr[j][i]);	
				else {}
			}
		}
		
	}
	else
	{
	for(int i=0;i<x+1;i++)
	{
		for(int j=0;j<x+1;j++)
		{
			arr[i][j]=ch1[s];
			s++;
		}
	}
	for(int i=0;i<x+1;i++)
	{
		for(int j=0;j<x+1;j++)
		{
			if((int)arr[j][i]!=32)
				System.out.print(arr[j][i]);
			
			else {}
		}
		
	}	
	}
}
else if(root==x)
{
	for(int i=0;i<x;i++)
	{
		for(int j=0;j<x;j++)
		{
			arr[i][j]=ch1[s];
			s++;
		}
	}
	for(int i=0;i<x;i++)
	{
		for(int j=0;j<x;j++)
		{
			if((int)arr[j][i]!=32)
				System.out.print(arr[j][i]);	
			else {}
		}
	}
}




}
}