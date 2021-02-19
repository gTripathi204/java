package program;
import java.util.Scanner;
import java.math.*;
public class h2 {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int a=0,b=0,c=0,n,r1=0,r2=0,r3=0,x=0,y=0;
   int arr[][]=new int[1233][223];
   n=sc.nextInt();
   
   for(int i=0;i<n;i++)
   {
	   for(int j=0;j<3;j++)
	   {
		   arr[i][j]=sc.nextInt();
	   }
   }
   for(int i=0;i<n;i++)
   {
	   a=arr[i][0];
	   b=arr[i][1];
	   c=arr[i][2];
	   r1=Math.abs(a-c);
	   r2=Math.abs(b-c);
	  if(r1<r2)
	  {
		  System.out.println("Cat A");
	  }
	  else if(r2<r1)
	  {
		  System.out.println("Cat B");
	  }
	  else
	  {
		  System.out.println("Mouse C");
	  }
   }
   
	}
}
