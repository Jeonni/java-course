import java.util.Scanner;

public class File02_LoopStatement {

	public static void main(String[] args) {
		// * �ݺ���
		//  ���α׷��� �帧�� Ư�� Ƚ�� �Ǵ� Ư�� ���ǿ� ���� �ݺ� ����ǵ��� �ϴ� ���
		
		// * for��
		//  "Hello World!"�� �ټ��� ���
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		// ==============================================
		
		int N = 10;
		
		System.out.println("===========================");
		for(int count = 0; count < N; count++) {
			System.out.println((count + 1) + " : Hello World!");
		}
		
		System.out.println("===========================");
		for(int count = 1; count <= N; count++) {
			System.out.println((count) + " : Hello World!");
		}
		
		System.out.println("===========================");
		for(int n = 300; n <= 350; n+=2) {
			System.out.println("n : " + n);
		}
		
		
		// * while ��
		//  Ư�� ������ ������ ������ �ݺ������ϴ� �ݺ���
		//  ����ڰ� 0�� �Է��� ������
		//  ����ڰ� ������ ������
		//   �� Ư�� Ƚ���� ���� ���� ���� ������ �𸣴� ���
		
		// * do-while ��
		//  Ư�� ������ ������ ������ �ݺ� �����ϴ� �ݺ���
		//   �� while ������ ������
		//           1. �ּ� 1���� ���� �ȴ�.
		//           2. while  :  �� �˻�, �� ����
		//           3. do-while : �� ����, �� �˻�
		
		boolean flag = true;
		
		//  ���ǽ��� ����� �׻� true �� �Ǹ� ���ѷ����� ������ �ȴ�.
		int n = 0;
		while(flag) {
			System.out.println("Hello World!");
			
			n++;
			if(n == 10) flag = false;
		}

		// ==============================================
		
		//  ����ڰ� 0�� �Է��� ������ ���ڸ� �Է� �޾Ƽ� ����Ѵ�.
		//  �� ���ᰡ �Ǵ� ����
		//  ����ڰ� 0 ���� ������ �Է��ϴ� ���� ���ڸ� ����Ѵ�.
		//  �� ����Ǵ� ����
		
		final int INIT_NUM = 1;
		n= INIT_NUM;
		Scanner input = new Scanner(System.in);
		
		// ==============================================
		// * while ��
		while(n!=0) {
			// ���ǽ��� true�� ��� ������ ���
			System.out.println("Enter a number : ");
			n = input.nextInt();
			System.out.println("n is " + n);
		}
		
		System.out.println("==============================================");
		
		// ==============================================
		// * do-while ��
		n = 0;
		do {
			// ���ǽ��� true �� ��� ������ ���
			System.out.println("Enter a number");
			n = input.nextInt();
			System.out.println("n is " + n);
		}while(n != 0);
		
		input.close();
	}

}
