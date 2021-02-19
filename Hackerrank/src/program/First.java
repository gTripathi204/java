package program;
import java.util.Scanner;
public class First {

	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int u=0,d=0 ,n,p;
  String temp;
  System.out.println("Enter ");
  n=sc.nextInt();
  char ch[]=new char[n];
  temp=sc.next() ;
  for(int i=0;i<n;i++)
  {
	  ch[i]=temp.charAt(i);
  }
  for(int i=0;i<n;i++)
  {
	  if(ch[i]=='U')
	  {
		  if(u==-1)
		  {
			  d++;
		  }
		  u++;
	  }
	  else if(ch[i]=='D')
	  {
		  u--;
	  }
  }
   System.out.println(d);
  
  
	}

}





//