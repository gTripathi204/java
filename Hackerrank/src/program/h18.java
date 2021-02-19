// Append and Delete

package program;
import java.util.*;
public class h18 {

	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int a,k=0,length1=0,takeall=0,length2=0,take1=0,take2=0;
  String a1,a2,make;
  char b1[]=new char[10000];
  char b2[]=new char[10000];
  a1=sc.nextLine();
  a2=sc.nextLine();
  a=sc.nextInt();
  boolean bd=false;
  
 
  
  for(int i=0;i<a1.length();i++)
  {
	  b1[i]=a1.charAt(i);
  }
  for(int i=0;i<a2.length();i++)
  {
	  b2[i]=a2.charAt(i);
  }

  for(int i=0;i<a1.length();i++)
  {
	  if(b1[i]=='z')
	  {
		 bd=true; 
	  }
	  else
	  {
		  bd=false;
	  }
  }
  
  
  
  length1=a1.length();
  length2=a2.length();
  boolean ab=true;
  for(int i=0;i<a1.length();i++)
  {
	 if(ab==true)
	 {
	  if(b1[i]==b2[i])
	  {
		  k++;
		  ab=true;
	}
	  else
	  {
		  ab=false;
	  }
	 } 
	
  }
  take1=length1-k;
  take2=length2-k;
  takeall=take1+take2;
  if(bd==true)
  {
	  System.out.println("Yes");
  }
  else if(a1.length()<a2.length())
  {
	  System.out.println("No");
  }
  else if(a>=takeall)
  {
	  System.out.println("Yes");
  }
  else
  {
	  System.out.println("No");
  }
    
	}

}
