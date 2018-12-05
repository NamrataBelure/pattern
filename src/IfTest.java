
public class IfTest {

	public static void main(String[] args) {
		int i,c=0,c1=0,c2=0;
		float[] w={45.0f,55.05f,47.0f,51.0f,54.0f};
		float[] h={176.5f,174.2f,168.0f,170.7f,169.0f};
        for(i=0;i<=4;i++){
        	if(w[i]<50.0&&h[i]>170.0){
        		c1=c1+1;
        	}
        	c=c+1;
        	}
      c2=c-c1;
      System.out.println("number of person with...");
      System.out.println("w<50 && h>170="+c1);
      System.out.println("other="+c2);
	}
	}


