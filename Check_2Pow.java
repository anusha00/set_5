import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();int f=0,po=1;
		if(n==1)
			System.out.print("yes");
		else if(n%2==0)
		{
			int i=2;
			while(po<=n)
			{
				po=po*2;
				if(po==n)
				f=1;
			}
			if(f==1)
			System.out.print("yes");
			else
			System.out.print("no");
		}
		else
		System.out.print("no");
	}
}
