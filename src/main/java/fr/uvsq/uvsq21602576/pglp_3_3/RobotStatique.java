package fr.uvsq.uvsq21602576.pglp_3_3;

/**
 * Classe représentant un robot statique.
 * Hérite de Robot.
 * Possède donc une position et une direction.
 * Est de type Tourne.
 * Donc a la possibilité de tourner.
 * @author Flora
 */
public class RobotStatique extends Robot implements Tourne {

    /**
     * Constructeur.
     * Crée un robot statique à partir
     * d'une position de coordonnée (x,y)
     * et d'une direction
     * @param x    Coordonnée x de la position
     * @param y    Coordonnée y de la position
     * @param d    Direction
     */
    public RobotStatique(final int x, final int y, final Direction d) {
        super(x, y, d);
    }

    /**
     * Tourne le robot dans le sens ouest vers nord.
     * Change sa direction.
     */
    public void tourne() {
        this.setDirection(this.getDirection().getNext());
    }

}
