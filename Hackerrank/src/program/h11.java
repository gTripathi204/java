package program;
import java.util.*;
public class h11 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n,first=5,take=0,j=0,result=0;

n=sc.nextInt();
for(int i=0;i<n;i++)
{
	take=first/2;
	result+=take;
	first=take*3;
	take=0;
}
System.out.println(result);
	}

}
