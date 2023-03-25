package practice;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0,b=1,c;
		
		for(int i=2;i<n;i++)
		{
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
	}
}
