package polymorphism;

public class SamsungTV implements TV {
	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다.");

	}

	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");

	}

	public void volumUp() {
		System.out.println("SamsungTV---소리 울린다.");

	}

	public void volumDown() {
		System.out.println("SamsungTV---소리 내린다.");

	}

}
