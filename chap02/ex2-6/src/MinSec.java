import java.util.Scanner;

public class MinSec {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sec;
		
		System.out.println("�� ���� �ð��� �Է��Ͻÿ�: ");
		sec = sc.nextInt();
		
		System.out.println(sec + "�ʴ� " + sec/60 + "�� " + sec%60 + "���Դϴ�.");
	}

}
