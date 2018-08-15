import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{

		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		int k=-1;
		for(int i=0;i<str1.length();i++)
		{
			char ch1=str1.charAt(i);
			for(int j=0;j<str2.length();j++)
			{
				char ch2=str2.charAt(j);
				if(ch1>ch2)
				{
					k=0;break;
				}
				else if(ch1<ch2)
				{
					k=1;break;
				}
			}
		}
		if(k==0)
		System.out.print(str1);
		else if(k==1)
		System.out.print(str2);
		else
		System.out.print(str1);

	}
}
