package fr.uvsq.uvsq21602576.pglp_3_3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RobotTest {

	@Test
	public void tourneTest() {
		Robot r = new Robot(5,4,Direction.NORD);
		r.tourne();
		assertEquals(Direction.EST,r.getDirection());
	}
	
	@Test
	public void avanceTest() {
		Robot r = new Robot(5,4,Direction.NORD);
		r.avance();
		assertEquals(5,r.getPosition().getX());
		assertEquals(3,r.getPosition().getY());
	}

}
