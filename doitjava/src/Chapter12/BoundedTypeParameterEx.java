package Chapter12;

public class BoundedTypeParameterEx {
	public static void main(String[] args) {
//		String str = Util2.compare("a", "b"); (x, String�� Number������ �ƴϹǷ� �ȵ�)
		int result1 = Util2.compare(10, 20);
		System.out.println(result1);

		int result2 = Util2.compare(4.5, 3);	//double�� int���� ũ�� ������ �� �� double�� ����ȴ�
		System.out.println(result2);

	}
}