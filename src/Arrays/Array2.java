package Arrays;
import java.util.*;
public class Array2 {

	public static void main(String[] args) {
		Object[]obs=new Object[5];
		obs[4]=new Array2();
		obs[1]="akash";
		obs[2]=10.0;
		
		int num[]=new int[5];
		num[0]=104;
		num[1]=23;
		num[3]=1723;
		num[4]=2012;
		num[1]=2317;
		System.out.println(Arrays.toString(num));
		Arrays.sort(num);
		System.out.println("sorted Array"+Arrays.toString(num));
		

	}

}
