import java.util.Scanner; // Scanner Ŭ������ ���Խ�Ű�� ����

public class Add2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x, y, sum;
		
		System.out.println("ù ��° ���ڸ� �Է��Ͻÿ�: ");
		x = sc.nextInt();
		
		System.out.println("�� ��° ���ڸ� �Է��Ͻÿ�: ");
		y = sc.nextInt();
		
		sum = x+y;
		System.out.println(sum);
	}

}
