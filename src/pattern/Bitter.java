package pattern;

import java.util.HashMap;

public class Bitter {//b=2,i=1,t=4,e=3,r=2}

	public static void main(String[] args) {
		String s="BitterBetter";
		char[] chars= s.toCharArray();
		int b=chars.length;
		System.out.println(b);
		for(int i=0;i<=b;i++){
			for(int j=1;j<=i;j++){
				int c=0;
				System.out.println(chars[i]);
				System.out.println(chars[j]);
			 if(chars[i]>chars[j])
				{ System.out.println(c++);
					//c++;	
				}
			}
	
		}
	}
}
	
	


