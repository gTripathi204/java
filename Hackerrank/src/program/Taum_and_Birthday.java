package program;
import java.util.*;
public class Taum_and_Birthday {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   long x,t=0;
   int n;
   n=sc.nextInt();
   long b[]=new long[n];
   long w[]=new long[n];
   long bc[]=new long[n];
   long wc[]=new long[n];
   long z[]=new long[n];
   for(int i=0;i<n;i++)
   {
	   b[i]=sc.nextInt();
	   w[i]=sc.nextInt();
	   bc[i]=sc.nextInt();
	   wc[i]=sc.nextInt();
	   z[i]=sc.nextInt();
   }
   for(int i=0;i<n;i++)
   {
	   if(z[i]>=wc[i] &&  z[i]>=bc[i])
	   {
		   x=b[i]*bc[i]+w[i]*wc[i];
		   t=x;
	   }
	   else if(bc[i]>wc[i]+z[i])
	   {
		   x=b[i]*wc[i]+w[i]*wc[i];
		   t=b[i]*z[i]+x;
	   }
	   else if(wc[i]>bc[i]+z[i])
	   {
		   x=b[i]*bc[i]+w[i]*bc[i];
		   t=w[i]*z[i]+x;
	   }
	   else
	   {
		   x=b[i]*bc[i]+w[i]*wc[i];
		   t=x;
	   }
	   System.out.println(t);
	   
	   
	}

}
}