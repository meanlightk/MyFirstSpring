package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
@Log4j

public class HotelTests {

	@Autowired
	private SampleHotel hotel;

	@Test
	public void testExit() {

		assertNotNull(hotel);
		log.info(hotel);
		log.info("--------------------------");
		log.info(hotel.getChef());
	}

}