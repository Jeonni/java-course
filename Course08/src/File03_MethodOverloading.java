
public class File03_MethodOverloading {
	/*
	 *  �޼��� �����ε� (Method Overloading)
	 *    - �޼���� ���õ� ������ �� �ϳ�
	 *    - ���� �̸��� �޼��尡 �پ��ϰ� ���ǵǴ� ���
	 */
	
	static int add(int x, int y) {
		return x + y;
	}
	
	static int addForThreeValue(int x, int y, int z) {
		return x + y + z;
	}
	
	// ���� �� �޼��� ��� �Ű������� ������ ��� ���� ���ϰ� ��ȯ�ϴ� ����� �����ϴ�.
	// �̶�, ������ �ĺ��ڴ��� �Ű������� Ÿ�� �Ǵ� ������ �ٸ���
	// ������ �ĺ��ڷ� ���ǰ� �����ϴ�.
	
	static int add(int x, int y, int z) {
		return x + y + z;
	}
	
	static double add (double x, double y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		int res1 = add(a, b);
		// �̹� ���ǵǾ� �ִ� add �޼����� �Ű������� 2���̱� ������
		// 3���� ���� ���� ���� �� ����.
		
		int res2 = add(add(a, b), c);
		int res3 = addForThreeValue(a, b, c);
		
		int res4 = add(a, b, c);
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
	}

}
