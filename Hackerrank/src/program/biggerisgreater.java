package program;
import java.util.*;
public class biggerisgreater {
 
	public static void bigfunction(String ab)
	{
		
		char ch[]=ab.toCharArray();
		int length=ch.length;
		int index=0;
		for(int i=length-1;i>0;i--)
		{
			if(ch[i]>ch[i-1])
			{
				index=i;
				break;
			}
		}
		if(index==0)
		{
			System.out.println("no answer");
		}
		else 
		{
			int fsc=ch[index-1],nsc=index;
		  
		}
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a;
    String arr[]=new String[1000000];
    a=sc.nextInt();
    for(int i=0;i<a;i++ )
    {
    	arr[i]=sc.next();
    }
    for(int i=0;i<a;i++)
    {
    	bigfunction(arr[i]);
    }
    
	}

}
