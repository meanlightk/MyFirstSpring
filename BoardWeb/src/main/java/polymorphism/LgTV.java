package polymorphism;

public class LgTV implements TV {
	public void powerOn() {
		System.out.println("LgTV---전원을 켠다.");

	}

	public void powerOff() {
		System.out.println("LgTV---전원 끈다.");

	}

	public void volumUp() {
		System.out.println("LgTV---소리 울린다.");

	}

	public void volumDown() {
		System.out.println("LgTV---소리 내린다.");

	}

}
