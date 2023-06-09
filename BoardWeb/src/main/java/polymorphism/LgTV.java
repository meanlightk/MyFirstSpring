package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")

public class LgTV implements TV {
	@Autowired
	@Qualifier("sony")
	private Speaker speaker;

	public LgTV() {
		System.out.println("===> LgTV 객체 생성");
	}

	public void powerOn() {
		System.out.println("LgTV---전원을 켠다.");

	}

	public void powerOff() {
		System.out.println("LgTV---전원 끈다.");

	}

	public void volumUp() {
		speaker.volumUp();

	}

	public void volumDown() {
		speaker.volumDown();
	}

}
