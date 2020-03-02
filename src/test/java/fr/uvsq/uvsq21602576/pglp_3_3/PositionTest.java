package fr.uvsq.uvsq21602576.pglp_3_3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PositionTest {

	@Test
	public void changerPositonTest() {
		Position p = new Position(5,4);
		p.changerPosition(-1,+1);
		assertEquals(4,p.getX());
		assertEquals(5,p.getY());
	}

}
