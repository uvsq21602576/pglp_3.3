package fr.uvsq.uvsq21602576.pglp_3_3;

/**
 * Classe abstraite représentant un robot basique.
 * Possède une direction et une position.
 * @author Flora
 */
public abstract class Robot {
    /**
     * Position du robot.
     */
    private Position position;
    /**
     * Direction du robot.
     */
    private Direction direction;

    /**
     * Pour modifier la position.
     * @param p Nouvelle position
     */
    protected void setPosition(final Position p) {
        this.position = p;
    }

    /**
     * Pour modifier la direction.
     * @param d Nouvelle direction
     */
    protected void setDirection(final Direction d) {
        this.direction = d;
    }

    /**
     * Constructeur.
     * Initialise un robot avec une position de coordonées (x,y)
     * et une direction.
     * @param x    Coordonnée x de la position
     * @param y    Coordonnée y de la position
     * @param d    Direction
     */
    public Robot(final int x, final int y, final Direction d) {
        this.position = new Position(x, y);
        this.direction = d;
    }

    /**
     * Retourne la direction du robot.
     * @return Direction
     */
    public Direction getDirection() {
        return this.direction;
    }

    /**
     * Retourne une position égale à celle du robot.
     * @return une copie de la position
     */
    public Position getPosition() {
        return new Position(this.position.getX(), this.position.getY());
    }

}
