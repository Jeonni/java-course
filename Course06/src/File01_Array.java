import java.util.Random;

public class File01_Array {

	static Random r = new Random();
	// 60 ~ 100 ������ ������ ���� ��ȯ�ϴ� ���
	public static int randomScore() {
		return r.nextInt(41) + 60;
	}
	
	public static void main(String[] args) {
		// * �迭(Array)
		//   �ڷ��� : ���� ��� �뵵�� ���� �����ϱ� ���� ������ Ÿ��
		
		// ���� �ڷ��� Ÿ���� �����͵��� ��� �뵵 �Ǵ� ������ ���� �ϳ��� �������� �ٷ�� ���� ����
		//  �� �迭 (Array)
		//   ��, �����͵��� ������ �ڷ� ����
		// =======================================================================
		
		// �л� 5���� ������ �����ϱ� ���� ������ ����
		int std1 = randomScore();
		int std2 = randomScore();
		int std3 = randomScore();
		int std4 = randomScore();
		int std5 = randomScore();
		
		System.out.println("std1 : " + std1);
		System.out.println("std2 : " + std2);
		System.out.println("std3 : " + std3);
		System.out.println("std4 : " + std4);
		System.out.println("std5 : " + std5);
		
		// * ���
		double avg = (double)(std1 + std2 + std3 + std4 + std5)/5;
		
		// * Ž��
		//  2��° �л��� ����
		//  search�� ����� ���� 1���� 5���� ���ǹ����� �˻��ؼ� ����ؾ� �Ѵ�.
		int search = 2;
		
		// * ������
		//  - ��/����� �ߺ��� �Ǵµ��� �ݺ������� ó���� �� ����.
		//  - ����ڰ� ���ϴ� ��ŭ ��/����� �� �� ����.
		//  - �����͵��� ������ �������̴�.
		//  - �������� ���� �ٲ�� ������ ����� �Ѵ�.
		//  - Ž���� ��� �˻��ϸ鼭 �ؾ� �Ѵ�.
		
		//  ���� ������ �ذ��ϱ� ���� ��� : �迭 (Array)
		System.out.println("========================================");
		// �迭 ����
		int studentCount = 10;
		// int �� �����Ͱ� 5�� ����� �迭
		int students[] = new int[studentCount];
		
		// �Է�
		for(int i = 0; i < students.length; i++) {
			students[i] = randomScore();
		}
		
		// ���
		for(int i = 0; i < students.length; i++) {
			System.out.println("student[" + i + "] : " + students[i]);
		}
		
		// ���
		int total = 0;
		for(int i = 0; i <students.length; i++) {
			total += students[i];
		}
		
		System.out.println("total : " + total);
		avg = (double)total/students.length;
		System.out.println("avg : " + avg);
		
	}

}
