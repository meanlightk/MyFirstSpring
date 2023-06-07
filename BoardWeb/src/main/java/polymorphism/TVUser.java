package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {

		/*
		 * TV tv1 = new SamsungTV(); TV tv2 = new SamsungTV(); TV tv3 = new SamsungTV();
		 */

		// 1. Spring 컨테이너를 구동한다.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");

		// 2. Spring 컨테이너로부터 필요한 객체를 요청(LookUp) 한다.
		TV tv = (TV) factory.getBean("tv");
		tv.powerOn();
		tv.powerOff();
		tv.volumUp();
		tv.volumDown();

		// 3. Spring 컨테이너를 종료한다.
		factory.close();
	}

}