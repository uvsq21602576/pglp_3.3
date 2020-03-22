package fr.uvsq.uvsq21602576.pglp_3_3;

/**
 * Enumération représentant les différentes directions.
 * @author Flora
 *
 */
public enum Direction {
    /**
     * Direction ouest.
     */
    OUEST(-1, 0),
    /**
     * Direction nord.
     */
    NORD(0, -1),
    /**
     * Direction est.
     */
    EST(+1, 0),
    /**
     * Direction sud.
     */
    SUD(0, +1);

    /**
     * Coordonnée x du vecteur de direction.
     */
    private final int dx;
    /**
     * Coordonnée y du vecteur de direction.
     */
    private final int dy;

    /**
     * Assigne une direction à un vecteur de coordonnées (x,y).
     * @param x    coordonnée x
     * @param y    coordonnée y
     */
    Direction(final int x, final int y) {
        this.dx = x;
        this.dy = y;
    }

    /**
     * Retourne la coordonées x du vecteur de direction.
     * @return coordonnée x
     */
    public int getDx() {
        return dx;
    }

    /**
     * Retourne la coordonées y du vecteur de direction.
     * @return coordonnée y
     */
    public int getDy() {
        return dy;
    }

    /**
     * Retourne la direction suivante à celle-ci,
     * dans l'ordre d'énumération :
     * OUEST, NORD, EST, SUD.
     * @return  Direction suivante
     */
    public Direction getNext() {
        int index = 0;
        for (Direction d : Direction.values()) {
            if (d.equals(this)) {
                index = (index + 1) % Direction.values().length;
                return Direction.values()[index];
            }
            index++;
        }
        return this;
    }

}
