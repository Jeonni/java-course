
public class File02_Method {
	
	/*
	 *  �޼��� (Method)
	 *    - ��ü�� �����ϴ� ��� �Ǵ� �ൿ�� �ǹ�
	 *    
	 *    ���
	 *      - ��ȯ Ÿ�� : �޼����� ��� ���� ������ Ÿ��
	 *                          : �޼����� ��� ���� ���� ��쿣 void �ۼ�
	 *      - �Ű� ���� : �޼��尡 ȣ���� �� ���޵Ǿ����� ���� �޴� ����
	 *                          : �Ķ���� (Parameter)��� �Ҹ���.
	 *      - ���� �� : �޼��尡 ȣ���� �� ���޵Ǿ����� ��
	 *                      : argument ��� �Ҹ���.
	 *      - ��ȯ �� : �޼����� ��� ������ ȣ��� ������ ��ȯ�Ǿ����� ��
	 *                      : return Ű���带 ���ؼ� ��ȯ�ȴ�.
	 *      - return : �Ϲ������� ��ȯ ���� ��ȯ�� �� ����ϴ� Ű����
	 *                     : �޼��带 ȣ���� ������ �ǵ��ư��� �� 
	 */
	
	// f(x) = x + 10
	static int f (int x) {
		return x + 10;
	}
	
	static int g(int x) {
		return x * 2;
	}
	
	public static void main(String[] args) {
		System.out.println(f(10));
		// �� System.out.println(20);
		
		System.out.println(f(20));
		// �� System.out.println(30);
		
		System.out.println(f(30));
		// �� System.out.println(40);
		
		System.out.println(g(f(10)));
		// �� System.out.println(g(20));
		// �� System.out.println(40);
	}

}
