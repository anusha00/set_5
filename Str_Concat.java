import java.util.*;
import java.lang.*;
import java.io.*;


class Str_Concat
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		int le=s1.length()+s2.length();
		int i=0;
		char ch[]=new char[le];
		for(i=0;i<s1.length();i++)
		{
			ch[i]=s1.charAt(i);
		}
		for(int j=0;j<s2.length();j++)
		{
			ch[i]=s2.charAt(j);
			i++;
		}
		for(int k=0;k<le;k++)
		System.out.print(ch[k]);
	}
}
