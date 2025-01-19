package com.zeus.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LomboksTests {

	@Test
	public void testNoArgsConstructor() {
		Board board = new Board();
		System.out.println(board);
	}
	

}
