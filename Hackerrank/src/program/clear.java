package program;
import java.util.*;
public class clear {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int a,b,c,d;
		
		int arr[]=new int[100];
		
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
		int circle[]=new int[arr.length];
				
        c=b-a;
        int take[]=new int[c];
        d=c;
        for(int i=0;i<c;i++)
        {
        	take[i]=arr[i];
        }
        for(int i=0;i<b;i++)
        {
        	circle[i]=arr[d];
        	d++;
        }
        for(int i=0;i<a;i++)
        {
        	System.out.println(circle[i]);
        }
	}

}
