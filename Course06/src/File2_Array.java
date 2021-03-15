import java.util.Random;

public class File2_Array {

		static Random r = new Random();
		// 60~100 ������ ������ ���� ��ȯ�Ѵ� ���
		public static int randomNumber() {
			return r.nextInt(201) - 100;
		}
		
	public static void main(String[] args) {
		// * �迭 (Array)
		//  ���� Ÿ���� �����͵��� ����
		int num; // �ϳ��� ������ �ϳ��� �����͸� ����ȴ�.
		
		// �迭 ���� ���� ����� ���� ������ �ʿ��ϴ�.
		// ���� ����ó�� Ÿ�԰� �ĺ��ڸ� �ۼ��ϰ� �߰������� �迭 ��ȣ ([])�� �ۼ��Ѵ�.
		// �̶� �迭 ��ȣ([]) �ȿ��� �ƹ��͵� �ۼ����� �ʴ´�.
		int numbers[];
		// �� �迭�� �����ߴٰ� �ؼ� �ټ��� �����͸� �����ϴ� ���� ������ ������� ���� �ƴϴ�.
		int length = 10;
		// * �迭 ����
		//   - new Ű���� : Ư�� �����͸� �޸𸮿� �Ҵ��Ͽ� �����.
		//   - new int [10] : int �� �����͸� �����ϱ� ���� ������ �޸𸮿� �Ҵ��Ѵ�.
		//    �� ��ȯ �� : �޸𸮿� �Ҵ�� �ּҸ� ��ȯ�Ѵ�.
		//   �� numbers ������ ������ �ִ� ���� �޸� �ּ��̴�.
		//    �� �޸� �ּҸ� �����ϴ� ���� : ���� ���� (Reference Variable)
		numbers = new int [length];
		System.out.println(numbers);
		
		// * �迭�� ����
		//   - ���� ������ �����ϰ� �ִ� ������ ũ�⸦ JVM�� �����ϱ� ������ �ٷ� ���� �˾ƿ� �� �ִ�.
		System.out.println("length : " + length);
		System.out.println("numbers.length : " + numbers.length);
		
		//   - �迭�� ũ��� �������̱� ������ �迭�� ũ�⸦ �׶� �׶� �ٷ� ������ �� ����.
		//     ���� �迭�� ũ�⸦ �ٲ���Ѵٸ� ���ο� �迭�� �����ؾ� �Ѵ�.
		numbers = new int[numbers.length + 5];
		System.out.println("numbers.length : " + numbers.length);
		
		// * �迭�� ��� ���
		//  - �迭 : �ε����� �ε����� �����Ǵ� �����͵�� �̷��� ����
		//  - �ε��� : �迭 ���� ������(���)�� �ٿ����� 0 �̻��� ������ ��ȣ
		//                 : �ε����� 0���� �����ؼ� 1�� �����Ѵ�.
		//                 : �ε����� �׻� �������� '�迭�� ���� - 1' �̴�.
		//                 : 0 <= index < length
		//  - ���� ����[index] : ���������� �����ϰ� �ִ� �޸� ��������
		//                                      index�� �ش��ϴ� ��������� �����Ѵ�.
//		numbers = new int [5];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		numbers[5] = 60;
		numbers[6] = 70;
		numbers[7] = 80;
		
		// �ε����� ������ �������̱� ������ �����ε� ����� �� ������
		// �ݺ������ε� ����� �� �ִ�.
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("index : " + i);
			// numbers[i] = (i+1) * 10;
			numbers[i] = randomNumber();
		}
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("numbers[" + i + "] = " + numbers[i]);
		}
		
		// * �迭�� �ʱ�ȭ
		//   - ������ �����Ǹ� �⺻ ������ �ʱ�ȭ�� �Ǿ�������
		//   - ���ϴ� �����ε� �ʱ�ȭ�� �� �� �ִ�.
		//   - �迭�� ���̴� �߰�ȣ ({}) ���� ������ ���� ��������.
		
		int iArr[] = new int[] {30,50,60,70,10,20,70};
		for(int i = 0; i < iArr.length; i++) {
			System.out.println("iArr[" + i + "] = " + iArr[i]);
		}
		
		// ���� ������ ����� �Բ� �ʱ�ȭ�� ������ 'new int []' �� ������ �� �ִ�.
		int iArr2 [] = {30, 50, 60, 70, 10, 20, 70};
		for(int i = 0; i <iArr2.length; i++) {
			System.out.println("iArr2[" + i + "] = " + iArr2[i]);
		}
		
		// ���Ŀ� �迭�� �ʱ�ȭ������ ' new int [] ' �� �ۼ��ؾ� �Ѵ�.
		iArr2 = new int [] {10,20,30,40,50};
		
 	}

}
