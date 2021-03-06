package fr.uvsq.uvsq21602576.pglp_3_3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Classe de test pour RobotStatique.
 * @author Flora
 */
public class RobotStatiqueTest {

    /**
     * Teste la méthode tourne.
     */
    @Test
    public void tourneTest() {
        RobotStatique r = new RobotStatique(5, 4, Direction.NORD);
        r.tourne();
        assertEquals(Direction.EST, r.getDirection());
    }

}
