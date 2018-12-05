package pattern;

public class ElseLad {

	public static void main(String[] args) {
		int r[]={1,2,3,4};
        int m[]={81,75,39,59};
        for(int i=0;i<r.length;i++){
        	if(m[i]>79){
        		System.out.println(r[i]+" Honours");
        	}
        	else if(m[i]>59){
        		System.out.println(r[i]+ " I Division");
        	}
        	else if(m[i]>49){
        		System.out.println(r[i]+" II Division");
              	}
        	else{
        		System.out.println(r[i]+" fail");
        	}
        }
        
	}

}
