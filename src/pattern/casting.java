package pattern;

public class casting {

	public static void main(String[] args) {
		System.out.println("variables created:");
		char c='x';
		byte b=50;
		short s=1996;
		int i=1234;
		long l=123456789L;
		float f=3.14F;
		double d=0.000987;
		System.out.println("c="+c);
		System.out.println("b="+b);
		System.out.println("s="+s);
		System.out.println("i="+i);
		System.out.println("l="+l);
		System.out.println("f="+f);
		System.out.println("d="+d);
		System.out.println(" ");
		System.out.println("types converted");
		short s1=(short)b;
	    short s2=(short)l;
	    float f1=(float)l;
	    int i2=(int)f;
	    System.out.println("(short)b"+s1);
	    System.out.println("(short)l"+s2);
	    System.out.println("(float)l"+f1);
	    System.out.println("(int)f"+i2);    		
	}

}
