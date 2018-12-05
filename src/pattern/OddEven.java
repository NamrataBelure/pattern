package pattern;

import java.util.Scanner;
import java.io.*;
public class OddEven {

	public static void main(String[] args) {
		int x;
		System.out.println("integer values:");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		
		if(x%2==0)
		{
			System.out.println("no is even");
		}
		else{
			System.out.println("no.is odd");
		}
	}

}
