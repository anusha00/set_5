import java.util.*;
import java.lang.*;
import java.io.*;


class Add_1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		if(m<10000000)
		System.out.print(m+1);
		else
			System.out.print("Invalid");
	}
}
