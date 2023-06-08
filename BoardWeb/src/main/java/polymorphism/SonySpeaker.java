package polymorphism;

import org.springframework.stereotype.Component;

@Component("sony")
public class SonySpeaker implements Speaker {

	public SonySpeaker() {
		System.out.println("===> SonySpeaker 객체 생성");
	}

	public void volumUp() {
		System.out.println("SonySpeaker---소리 울린다.");

	}

	public void volumDown() {
		System.out.println("SonySpeaker---소리 내린다.");

	}

}
