package pattern;

import java.io.DataInputStream;

public class Reading {

	public static void main(String[] args) {
		DataInputStream in=new DataInputStream(System.in);
		int intnum=0;
		float floatnum=0.0f;
		try{
			System.out.println("enter an integer");
		    intnum=Integer.parseInt(in.readLine());
			System.out.println("Enter an float");
			floatnum=Float.valueOf(in.readLine()).floatValue();
		}	catch(Exception e){}
		System.out.println("intnum="+intnum);
		System.out.println("floatnum="+floatnum);
	}

}
