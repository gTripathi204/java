package program;
import java.util.*;
public class h10 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int y,p,i, j,k,rev=0,b,beautiful=0,math;
i=sc.nextInt();
j=sc.nextInt();
k=sc.nextInt();

for(int x=i;x<=j;x++)
{
		y=x;
		p=x;
	while(y>0)
	{
		b=y%10;
		rev=rev*10+b;
		y=y/10;
	}
    math=p-rev;
    if(math%k==0)
    {
    	beautiful+=1;
    }
	rev=0;
	
}
System.out.println(beautiful);
	}

}
