import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		int max=a[0],min=a[0];
		if(n==1)
		System.out.println(a[0]+" "+a[0]);
		else
		{
			for(int i=0;i<n;i++)
			{
				if(min>a[i])
				min=a[i];
				if(max<a[i])
				max=a[i];
			}
			System.out.println(min+" "+max);
		}
		
	}
}
