
public class BitOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte status = (byte) 010100110;
		
		System.out.println("세탁기 문이 열려 있는가? " + ((status&00000010)!=0));
	}

}
