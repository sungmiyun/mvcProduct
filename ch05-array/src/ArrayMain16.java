public class ArrayMain16 {
	public static void main(String[] args) {
		int[] array1 = {11,22,33,44,55};
		int[] array2 = new int[10];
		
		//������ �ǹ�
		//1 : �����ҽ� �迭(array1)
		//2 : ���� �ҽ� �迭�� ���� ��ġ(0)
		//3 : ���� �ҽ��� ����Ǵ� ��ġ(����ó,array2)
		//4 : ����ó ���� ���� ��ġ(3)
		//5 : ����Ǵ� �迭�� ����� ��(5)
		System.arraycopy(array1, 0, array2, 3, 5);
		
		System.out.println("---���� �迭---");
		for(int in : array1) {
			System.out.print(in + " ");
		}
		
		System.out.println("\n---���纻 �迭---");
		for(int in : array2) {
			System.out.print(in + " ");
		}
	}
}



