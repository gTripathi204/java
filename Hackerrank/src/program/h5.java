package program;
import java.util.*;
public class h5 {

    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n,m;
   int pick=1;
   int scores[]=new int[1000000];
   int rank[]=new int[1000000];
   int alice[]=new int[1000000];
  n=sc.nextInt();
  for(int i=1;i<=n;i++)
  {
      scores[i]=sc.nextInt();
  }
  
  //alice
    m=sc.nextInt();
  for(int i=1;i<=m;i++)
  {
        alice[i]=sc.nextInt();
  }
  
  
  rank[0]=pick; 
  
  for(int i=2;i<=n;i++)
  {
      if(scores[i]==scores[i-1])
      {
          rank[i]=pick;
          
      }
      else
      {
          pick+=1;
          rank[i]=pick;
         
      }
  }
   for(int j=1;j<=m;j++)
 {
     if(alice[j]<scores[n])
     {
         System.out.println(rank[n]+1);
     }
     else if(alice[j]>=scores[1])
     {
         System.out.println(rank[0]);
     }
     else
     {
         for(int i=1;i<n;i++)
         {
             if(alice[j]<scores[i] && alice[j]>scores[i+1])
             {
                System.out.println(rank[i]+1);
             }
             else if(alice[j]==scores[i] && alice[j]!=scores[i+1])
             {
                 System.out.println(rank[i]);
             }
         }
     }
     
 }
  
 

}}
