import java.util.Scanner;
public class TwoInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		System.out.print("x: ");
		x = sc.nextInt();
		System.out.print("y: ");
		y = sc.nextInt();
		
		System.out.println("�� ���� ��: "+(x+y));
		System.out.println("�� ���� ��: "+(x-y));
		System.out.println("�� ���� ��: "+(x*y));
		System.out.println("�� ���� ���: "+((x+y)/2));
		System.out.println("ū ��: "+((x>y)? x:y));
		System.out.println("���� ��: "+((x>y)? y:x));
	}

}
