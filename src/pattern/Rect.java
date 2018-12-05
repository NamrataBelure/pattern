package pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Rect {

	public static void main(String[] args) {
	System.out.println("enter the value:");
	Scanner sc=new Scanner(System.in);
	int r=0;
	try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		r=Integer.parseInt(br.readLine());
	}
	catch (IOException ioe) {
		System.out.println(" IO Error"+ioe);
		System.exit(0);
		}
		double area=Math.PI*r*r;
		System.out.println("Area of  circle is:"+area);
	
	}

}
