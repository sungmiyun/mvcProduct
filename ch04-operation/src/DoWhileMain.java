
public class DoWhileMain {

	public static void main(String[] args) {
		int su = 0;
		String str = "Hello World!!!";
		
		while(su++ < 5) {
			System.out.println(str);
		}
		System.out.println("===================");
		
		int su2 = 0;
		
		do {
			System.out.println(str);
		} while (su2++ < 5);
		
		
		
	}
}
