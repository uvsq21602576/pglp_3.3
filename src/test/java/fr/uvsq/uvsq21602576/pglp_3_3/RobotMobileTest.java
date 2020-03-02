package fr.uvsq.uvsq21602576.pglp_3_3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RobotMobileTest {

	@Test
	public void tourneTest() {
		RobotMobile r = new RobotMobile(5,4,Direction.NORD);
		r.tourne();
		assertEquals(Direction.EST,r.getDirection());
	}
	
	@Test
	public void avanceTest() {
		RobotMobile r = new RobotMobile(5,4,Direction.NORD);
		r.avance();
		assertEquals(5,r.getPosition().getX());
		assertEquals(3,r.getPosition().getY());
	}

}
