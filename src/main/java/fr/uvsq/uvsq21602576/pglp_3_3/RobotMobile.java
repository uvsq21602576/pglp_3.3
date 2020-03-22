package fr.uvsq.uvsq21602576.pglp_3_3;

/**
 * Classe représentant un robot mobile.
 * Hérite de Robot.
 * Possède donc une position et une direction.
 * Est de type Avance et Tourne.
 * Donc a la possibilité d'avancer et de tourner.
 * @author Flora
 */
public class RobotMobile extends Robot implements Avance, Tourne {

    /**
     * Constructeur.
     * Crée un robot mobile à partir
     * d'une position de cooredonées (x,y)
     * et d'une direction.
     * @param x    Coordonnée x de la position
     * @param y    Coordonnée y de la position
     * @param d    Direction
     */
    public RobotMobile(final int x, final int y, final Direction d) {
        super(x, y, d);
    }

    /**
     * Tourne le robot dans le sens ouest vers nord.
     * Change sa direction.
     */
    public void tourne() {
        this.setDirection(this.getDirection().getNext());
    }

    /**
     * Avance le robot d'une case en fonction de sa direction.
     */
    public void avance() {
        Direction d = this.getDirection();
        Position p = getPosition().changerPosition(d.getDx(), d.getDy());
        this.setPosition(p);
    }

}
