import java.util.Scanner; // Scanner 클래스를 포함시키는 문장

public class Add2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x, y, sum;
		
		System.out.println("첫 번째 숫자를 입력하시오: ");
		x = sc.nextInt();
		
		System.out.println("두 번째 숫자를 입력하시오: ");
		y = sc.nextInt();
		
		sum = x+y;
		System.out.println(sum);
	}

}
