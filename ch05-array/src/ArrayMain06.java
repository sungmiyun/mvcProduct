
public class ArrayMain06 {

	public static void main(String[] args) {
		//��ü�� �迭 
		String[] array = new String[5];
		
		array[0] = "Java";
		array[1] = "JSP";
		array[2] = "Servlet";
		array[3] = "Spring";
		array[4] = "Android";
		
		//�ݺ����� �̿��� �迭�� ��� ���
		for(int i = 0 ; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("============================");
		//Ȯ�� for���� �̿��� �迭�� ��� ���
		for(String str : array) {
			System.out.println(str);
		}
		
		
		
		
	}

}
