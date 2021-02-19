package program;
import java.util.*;
import java.math.*;
public class h17 {
public static void fact(int x)
{
	BigInteger f=new BigInteger("1");
	  for(int i=1;i<=x;i++)
	  {
		  f=f.multiply(BigInteger.valueOf(i));
	  }
	  System.out.println(f);
		}


	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int a,n;
  n=sc.nextInt();
fact(n);  
}}
