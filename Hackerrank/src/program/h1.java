package program;
import java.util.Scanner;
public class h1 {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int take=0,n,x=0,m,p,make=0;
   int arr1[]=new int[10000];
   int arr2[]=new int[10000];
   int add;
   p=sc.nextInt();
   n=sc.nextInt();
   m=sc.nextInt();
   for(int i=0;i<n;i++)
   {
	   arr1[i]=sc.nextInt();
   }
   for(int i=0;i<m;i++)
   {
	   arr2[i]=sc.nextInt();
	     }
   
   for(int i=0;i<n;i++)
   {
	   for(int j=0;j<m;j++)
	   {
		   add=arr1[i]+arr2[j];
		   if(add>=make && add<=p)
		   {
			  
			  make=add;
		   }
		  		   
	 }
   }
   if(make>0)
   {
	   System.out.println(make);
   }
   else {
   System.out.println("-1");
   }
   
   
   
	}

}
