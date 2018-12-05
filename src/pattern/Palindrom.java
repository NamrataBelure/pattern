package pattern;

import java.util.Scanner;

public class Palindrom {
        public static void main(String[] args){
		System.out.println("enter the values");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int n=num;
        int rev=0,rmd;
        while(num>0){
        	rmd=num%10;
        	rev=rev*10+rmd;
        	num=num/10;
        }
       if(rev==n){
    	     System.out.println("no.is palindrom");
             }
       else
          {
    	   System.out.println("no.is not palindrom");
          }
       }
	}

