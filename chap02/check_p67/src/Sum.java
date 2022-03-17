import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c, sum;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 수를 입력하시오: ");
		a = sc.nextDouble();
		
		System.out.println("두 번째 수를 입력하시오: ");
		b = sc.nextDouble();
		
		System.out.println("세 번째 수를 입력하시오: ");
		c = sc.nextDouble();
		
		sum = a+b+c;
		System.out.println(sum);
	}

}
