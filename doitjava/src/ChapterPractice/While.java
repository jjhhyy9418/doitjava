package ChapterPractice;

public class While {
	public static void main(String[] args) {
		int a = 0;
		
		while (a < 10) {
			a++;
			if (a % 2 == 0) {
				continue;
			}
			System.out.println(a);
		}
	}
}
