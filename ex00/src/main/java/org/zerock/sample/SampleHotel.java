package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Component
@ToString
@Getter
@AllArgsConstructor // -> 생성자 만들어줌

public class SampleHotel {
	// @Autowired -> v4.3 이후, 묵시적 생성자 주입
	private Chef chef;
}
