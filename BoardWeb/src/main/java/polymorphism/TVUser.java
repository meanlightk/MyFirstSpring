package polymorphism;

public class TVUser {

	public static void main(String[] args) {
		SamsungTV tv = new SamsungTV();
		tv.powerOn();
		tv.volumUp();
		tv.volumDown();
		tv.powerOff();

	}

}


/*

public class TVUser {

	public static void main(String[] args) {
		LgTV tv = new LgTV();
		tv.turnOn();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();

	}

}

 */