import java.util.Scanner;

public class LightningtoSound {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gap, howLong;
		
		System.out.print("�ð� ������ �Է��Ͻÿ�(����: ��): ");
		gap = sc.nextInt();
		
		howLong = gap*300;
		System.out.println("������ �߻��� �������� �Ÿ�: "+howLong+"m");
	}

}
