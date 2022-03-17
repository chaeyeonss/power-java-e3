import java.util.Scanner;

public class MiletoKilo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double mile;
		
		System.out.print("마일을 입력하시오: ");
		mile = (double) (sc.nextDouble());
		System.out.println(mile+"마일은 "+(mile*1.609)+"킬로미터입니다.");
	}

}
