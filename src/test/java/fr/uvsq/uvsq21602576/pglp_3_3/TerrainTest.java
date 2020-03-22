package fr.uvsq.uvsq21602576.pglp_3_3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Classe de test pour Terrain.
 * @author Flora
 *
 */
public class TerrainTest {

    /**
     * Teste la méthode avanceTous.
     */
    @Test
    public void avanceTousTest() {
        Terrain t = new Terrain();
        t.ajoutRobot(new RobotMobile(5, 4, Direction.NORD));
        t.ajoutRobot(new RobotStatique(3, 3, Direction.SUD));
        t.avanceTous();
        assertEquals(5, t.getPosition(0).getX());
        assertEquals(3, t.getPosition(0).getY());
        assertEquals(3, t.getPosition(1).getX());
        assertEquals(3, t.getPosition(1).getY());
    }

    /**
     * Teste la méthode tourneTous.
     */
    @Test
    public void tourneTousTest() {
        Terrain t = new Terrain();
        t.ajoutRobot(new RobotMobile(5, 4, Direction.NORD));
        t.ajoutRobot(new RobotStatique(3, 3, Direction.SUD));
        t.tourneTous();
        assertEquals(Direction.EST, t.getDirection(0));
        assertEquals(Direction.OUEST, t.getDirection(1));
    }

}
