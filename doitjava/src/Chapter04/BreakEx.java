package Chapter04;

public class BreakEx {
	public static void main(String[] args) {
		int num = 1;
		switch(num) {
		case 1:  
			System.out.println("num�� 1�Դϴ�.");
			break;	//switch���� �ı��ϴ� break
		case 2:  
			System.out.println("num�� 2�Դϴ�.");
			break;
		default:
			System.out.println("num�� 1�� 2�� �ƴ� �ٸ� ���Դϴ�.");
		}
		
		while(true) {	//������ true�̸� ���ѹݺ����̴�.
			System.out.println("�ݺ���..." + num);
			num++;
			if(num > 10) {
				break;	//while���� �ı��ϴ� break, if���� �ı��� �� ����.
			}
		
		}
		
		for(int i=0; i<3; i++) {
			System.out.print("*");
			break;
		}
		System.out.println( );
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("@");
				break;	//���� ������ �ִ� �ݺ����� �ı���Ų��.
			}
			System.out.println();
		}
	}
}