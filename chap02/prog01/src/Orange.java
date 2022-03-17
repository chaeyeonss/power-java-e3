import java.util.Scanner; // 사용자 입력을 받기 위함

public class Orange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int howMany;
		
		System.out.print("오렌지의 개수를 입력하시오: ");
		howMany = sc.nextInt();
		
		System.out.println((howMany/10)+"박스가 필요하고 "+(howMany%10)+"개가 남습니다.");
	}

}