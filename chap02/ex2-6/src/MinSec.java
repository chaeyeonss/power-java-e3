import java.util.Scanner;

public class MinSec {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sec;
		
		System.out.println("초 단위 시간을 입력하시오: ");
		sec = sc.nextInt();
		
		System.out.println(sec + "초는 " + sec/60 + "분 " + sec%60 + "초입니다.");
	}

}
