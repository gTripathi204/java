package program;
import java.util.*;
import java.math.*;


public class h13 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a,n=0,b,c,take=0,round=0;
    int arr[]=new int[100000];
    int circle[]=new int[100000];
    int place[]=new int[100000];
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    for(int i=0;i<a;i++)
    	{
    	arr[i]=sc.nextInt();
    	
    	}
    for(int i=0;i<c;i++)
    {
    	place[i]=sc.nextInt();
    }
    n=a;
    if(a==b)
    {
    	for(int i=0;i<c;i++)
        {
       	take=place[i]; 
       	 System.out.println(arr[take]);
        }	
    }
    else {
     round=b%a;
    
     for(int j=0;j<round;j++)
     {
     for(int i=0;i<a;i++)
     {
    	 if(i==0)
    	 {
    		 circle[i]=arr[n-1];
    	 }
    	 else
    	 {
    		 circle[i]=arr[i-1];
    	 }
    	    	 
     }
     for(int k=0 ;k<a;k++) {
    	 arr[k]=circle[k];
    	 
     }   }
     
     for(int i=0;i<c;i++)
     {
    	take=place[i]; 
    	 System.out.println(circle[take]);
     }
    
    }
    
     
     
     
    
	}
}
