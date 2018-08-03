import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();int f=0;
		int cnt=0;
		while(n!=0)
		{
			cnt++;
			n=n/10;
			
		}
		System.out.print(cnt);
	}
}
