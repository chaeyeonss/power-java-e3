import java.util.Scanner; // ����� �Է��� �ޱ� ����

public class Orange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int howMany;
		
		System.out.print("�������� ������ �Է��Ͻÿ�: ");
		howMany = sc.nextInt();
		
		System.out.println((howMany/10)+"�ڽ��� �ʿ��ϰ� "+(howMany%10)+"���� �����ϴ�.");
	}

}