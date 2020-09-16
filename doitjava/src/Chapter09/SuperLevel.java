package Chapter09;

public class SuperLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다");
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 Jump합니다");
	}

	@Override
	public void turn() {
		System.out.println("한바퀴 Turn합니다");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 상급자 레벨입니다 *****");
	}

}
