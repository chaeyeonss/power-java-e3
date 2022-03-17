import java.util.Scanner;

public class LightningtoSound {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gap, howLong;
		
		System.out.print("시간 간격을 입력하시오(단위: 초): ");
		gap = sc.nextInt();
		
		howLong = gap*300;
		System.out.println("번개가 발생한 곳까지의 거리: "+howLong+"m");
	}

}
