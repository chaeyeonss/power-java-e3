import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c, sum;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° ���� �Է��Ͻÿ�: ");
		a = sc.nextDouble();
		
		System.out.println("�� ��° ���� �Է��Ͻÿ�: ");
		b = sc.nextDouble();
		
		System.out.println("�� ��° ���� �Է��Ͻÿ�: ");
		c = sc.nextDouble();
		
		sum = a+b+c;
		System.out.println(sum);
	}

}
