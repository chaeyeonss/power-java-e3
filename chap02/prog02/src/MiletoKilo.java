import java.util.Scanner;

public class MiletoKilo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double mile;
		
		System.out.print("������ �Է��Ͻÿ�: ");
		mile = (double) (sc.nextDouble());
		System.out.println(mile+"������ "+(mile*1.609)+"ų�ι����Դϴ�.");
	}

}
