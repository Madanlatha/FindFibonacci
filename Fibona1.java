package findFibonacci;

import java.util.Scanner;

public class Fibona1 {
	int fib(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		Fibona1 fibccal=new Fibona1();
		System.out.println(fibccal.fib(n));;
	}

}
