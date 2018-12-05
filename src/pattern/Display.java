package pattern;

public class Display {

	public static void main(String[] args) {
		System.out.println("screen Display");
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++)
			{
				System.out.println("");
				System.out.println(i);
			}
			System.out.println("\n");
		}
      System.out.println("screen display done");
	}

}
