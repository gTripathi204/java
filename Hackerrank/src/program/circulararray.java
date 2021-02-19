package program;
import java.util.*;
import java.math.*;


public class circulararray {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a,n=0,b,c,m,e,round=0;
    int arr[]=new int[100000];
    int circle[]=new int[100000];
    int place[]=new int[100000];
    int take[]=new int[10000];
    a=sc.nextInt();
    e=a;
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
    boolean ab=false;
    if(a==b)
    {
    	  for(int i=0;i<c;i++)
    	    {
    	    	round=place[i];
    	  	  System.out.println(arr[round]);
    	    }
    }
    else {
      m=a-b;
        
    for(int i=0;i<m;i++)
    {
  	  take[i]=arr[i];
    }
   for(int i=0;i<b;i++)
   {
  	 circle[i]=arr[m];
  	 m++;
   }
   int d=0;
    while(b<e)
   {    
  	 circle[b]=take[d];
  	
  	 d++;
  	 b++;
   }
    ab=true;
    }
    
    
    
    if(ab==true)
    {
    for(int i=0;i<c;i++)
    {
    	round=place[i];
  	  System.out.println(circle[round]);
    }
    }
    
    
     
     
     
    
	}
}
