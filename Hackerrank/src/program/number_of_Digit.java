package program;
import java.util.*;

public class number_of_Digit {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   
    long a,b=0;
    a=sc.nextLong();
    while(a>0)
    {
    b++;
    a=a/10;
    	
    }
    System.out.println(b);
	}

}
