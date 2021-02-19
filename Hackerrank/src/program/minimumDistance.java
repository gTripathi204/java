package program;
import java.util.Scanner;
import java.util.stream.IntStream;
public class minimumDistance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[10000];
		int ans;
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++) {
        for(int j=a;j>i+1;j--)
        {
        	if(arr[i]==arr[j]) {
        		int take=(j+1)-(i+1);
        		ans=take;     				
        		}
        	}
        }
		
		
		}
		
		

	}

}
