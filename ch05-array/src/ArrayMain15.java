public class ArrayMain15 {
	public static void main(String[] args) {
		//�迭 ����� ����
		char[] array = {'z','c','e','a','q'};
		
		//������(������ ǥ�õ� ���ĺ� ������ ����)
		java.util.Arrays.sort(array);
		//�迭�� ��� ���
		for(char ch : array) {
			System.out.print(ch + " ");
		}
		System.out.println("\n-------------");
		
		int[] array2 = {89,39,5,2,1,6,0};
		java.util.Arrays.sort(array2);
		//�迭�� ��� ���
		for(int in : array2) {
			System.out.print(in + " ");
		}
		
		
	}
}


