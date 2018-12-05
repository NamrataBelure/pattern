package pattern;

import java.util.Scanner;

public class AllPrime {

	public static void main(String[] args){
		int n,s=1,num=3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of prime no you want");
		n=sc.nextInt();
		if(n>=1){
			System.out.println("Frist"+n+"prime no.are");
			System.out.println(2);
		}
		for(int c=2;c<=n;){
			for(int j=2;j<=Math.sqrt(num);j++){
				if(num%j==0){
				s=0;
				break;
				}
			}
		if(s!=0)
		{
			System.out.println(num);
			c++;
		}
		s=1;
		num++;
		}

	}

}
