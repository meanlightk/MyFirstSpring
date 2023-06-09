package polymorphism;

import org.springframework.stereotype.Component;

@Component("tv")
public class SamsungTV implements TV {
	private Speaker speaker;
	//private int price;

	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 객체 생성");
	}

	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker 호출");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("===> setPrice 호출");
		//this.price = price;
	}

	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다.");

	}

	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");

	}

	public void volumUp() {
		speaker.volumUp();

	}

	public void volumDown() {
		speaker.volumDown();

	}

}
