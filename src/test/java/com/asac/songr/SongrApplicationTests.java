package com.asac.songr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}
@Test  void testGetSetForAlbum(){
		Album album = new Album("t","t",1,1,"t");
		String test = album.getTitle();
	System.out.println(test);
assertEquals("test getters","t",test);

}
}
