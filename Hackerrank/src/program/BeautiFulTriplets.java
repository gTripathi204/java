package program;
import java.util.*;
import java.util.Arrays; 
import java.util.stream.IntStream; 
public class BeautiFulTriplets {

		public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int arr[]=new int[a];
    int ans=0;
    for(int i=0;i<a;i++)
    {
    	arr[i]=sc.nextInt();
    }
    for(int i=0;i<a;i++)
    {
    for(int j=i+1;j<a;j++) {
    	if(arr[j]-arr[i]==b) {
    		int at=arr[j]+b;
    		boolean ab= IntStream.of(arr) 
                    .anyMatch(x -> x == at); 
    		if(ab==true)
    		{
    			ans++;
    		}
    	}
    		
    	}
    		
    }
    
    System.out.println(ans);
    
    
    
    
		}
	
}
