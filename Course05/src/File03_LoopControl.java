import java.util.Scanner;

public class File03_LoopControl {

	public static void main(String[] args) {
		// * �ݺ��� ����
		
		// * break��
		//  �ݺ����� �����ϱ� ���� Ű����
		//  �ݺ� ���� ���߿� �ݺ����� �����ϱ� ���� ���ȴ�.
		
		Scanner input = new Scanner(System.in);
		
		int n = 1;
		// 0�� �Է��� ������ ������ �Է� �޾� ����ϵ��� �强
		// ������ �Է¹޾��� ���� ������� �ʰ� �ٽ� �Է��� �޵��� �Ѵ�.
		while(n != 0) {
			System.out.print("Enter an integer : ");
			n = input.nextInt();
			
			// n�� 0�̸� �ݺ����� ����
			if(n==0) {
				System.out.println("System End");
				break; 
			}
			if(n<0) continue;
		}
		
		// ����
		//  - �鿩���� �ּ�ȭ
		//  - �߿��� �ڵ忡 ���ʿ��� ���� ������ ��찡 ����.
		System.out.println("n : " + n);
		
		input.close();

	}

}
