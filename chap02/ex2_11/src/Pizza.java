import java.util.*;
public class Pizza {
	public static void main(String[] args) {
		double area1 = 2*3.14*20*20;
		double area2 = 3.14*30*30;
		
		System.out.println("20cm 피자 두 판: "+area1);
		System.out.println("30cm 피자 한 판: "+area2);
		System.out.println((area1 > area2)? "1번" : "2번" + " 주문하기");

	}

}
