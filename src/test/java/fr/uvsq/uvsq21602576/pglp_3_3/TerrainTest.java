package fr.uvsq.uvsq21602576.pglp_3_3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TerrainTest {

	@Test
	public void avanceTousTest() {
		Terrain T = new Terrain();
		T.ajoutRobot(new RobotMobile(5, 4, Direction.NORD));
		T.ajoutRobot(new RobotStatique(3, 3, Direction.SUD));
		T.avanceTous();
		assertEquals(5,T.getPosition(0).getX());
		assertEquals(3,T.getPosition(0).getY());
		assertEquals(3,T.getPosition(1).getX());
		assertEquals(3,T.getPosition(1).getY());
	}
	
	@Test
	public void tourneTousTest() {
		Terrain T = new Terrain();
		T.ajoutRobot(new RobotMobile(5, 4, Direction.NORD));
		T.ajoutRobot(new RobotStatique(3, 3, Direction.SUD));
		T.tourneTous();
		assertEquals(Direction.EST,T.getDirection(0));
		assertEquals(Direction.OUEST,T.getDirection(1));
	}

}
