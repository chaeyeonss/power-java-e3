import java.util.Scanner;
public class FtoC {
	public static void main(String[] args) {
		int choice;    // 선택한 동작
		double temp;   // 입력받은 온도
		double res = 0; // 계산된 온도값 결과
		Scanner sc = new Scanner(System.in); // 사용자의 입력 받는 스캐너
		
		System.out.println(" ===============");
		System.out.println("  1. 화씨 -> 섭씨 ");
		System.out.println("  2. 섭씨 -> 화씨 ");
		System.out.println(" ===============");
		
		System.out.print("동작을 선택하시오: ");
		choice = sc.nextInt();
		
		System.out.print("온도를 입력하시오: ");
		temp = sc.nextDouble();
		
		if (choice == 1)
			res = 5.0/9.0*(temp-32.0);
		if (choice == 2)
			res = (temp+32.0)*(9.0/5.0);			
		
		System.out.println("계산 결과, "+ res +"도입니다.");
	}

}
