package pattern;

public class CmdLine {

	public static void main(String[] args) {
		int c,i=0;
		String str;
		c=args.length;
		System.out.println("number of Argument:");
		while(i<c){
			str =args[i];
			i=i+1;
			System.out.println(i+"i"+"java is"+c);
		}

	}

}
