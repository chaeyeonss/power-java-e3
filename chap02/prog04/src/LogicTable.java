
public class LogicTable {

	public static void main(String[] args) {
		System.out.println("P\tQ\tAND\tOR\tXOR\t");
		
		boolean p = true, q = true;
		System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q));
		
		p = true; q = false;
		System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q));
		
		p = false; q = true;
		System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q));
		
		p = false; q = false;
		System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q));
	}

}
