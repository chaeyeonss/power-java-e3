import java.util.Scanner;
public class FtoC {
	public static void main(String[] args) {
		int choice;    // ������ ����
		double temp;   // �Է¹��� �µ�
		double res = 0; // ���� �µ��� ���
		Scanner sc = new Scanner(System.in); // ������� �Է� �޴� ��ĳ��
		
		System.out.println(" ===============");
		System.out.println("  1. ȭ�� -> ���� ");
		System.out.println("  2. ���� -> ȭ�� ");
		System.out.println(" ===============");
		
		System.out.print("������ �����Ͻÿ�: ");
		choice = sc.nextInt();
		
		System.out.print("�µ��� �Է��Ͻÿ�: ");
		temp = sc.nextDouble();
		
		if (choice == 1)
			res = 5.0/9.0*(temp-32.0);
		if (choice == 2)
			res = (temp+32.0)*(9.0/5.0);			
		
		System.out.println("��� ���, "+ res +"���Դϴ�.");
	}

}
