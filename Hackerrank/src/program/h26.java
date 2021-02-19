package program;
import java.util.*;
import java.math.*;
import java.util.Scanner;

public class h26 {
	public static int count_straight(int x,int g,int k)
	{
		int make=0;
		int arr[][]=new int[x][x];
		for(int i=x;i>0;i--)
		{
			for(int j=0;j<x;j++)
			{
				if(i==g||j==k)
				{
					make++;
				}
			}
		}
		return 5;
	}
	
	
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	int n,k,a,b,queen=1,take=0;
	n=sc.nextInt();
	k=sc.nextInt();
	a=sc.nextInt();
	b=sc.nextInt();
	int arr[][]=new int[n+1][n+1];
	int arr2[][]=new int[k][k];
	for(int i=0;i<k;i++)
	{
		for(int j=0;j<2;j++)
		{
			arr2[i][j]=sc.nextInt();
		}
	}
   
   
   }}
