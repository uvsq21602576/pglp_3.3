package fr.uvsq.uvsq21602576.pglp_3_3;

/**
 * Classe représentant une position bidimensionnelle.
 * @author Flora
 */
public class Position {
    /**
     * Coordonnée x.
     */
    private int x;
    /**
     * Coordonnée y.
     */
    private int y;

    /**
     * Constructeur.
     * Crée une position à partir de coordonnées (x,y).
     * @param pX    coordonnée x
     * @param pY    coordonnée y
     */
    public Position(final int pX, final int pY) {
        this.x = pX;
        this.y = pY;
    }

    /**
     * Change la position par le vecteur (dx,dy).
     * @param dx   coordonnée x du vecteur de direction
     * @param dy   coordonnée y du vecteur de direction
     * @return  la position modifiée
     */
    public Position changerPosition(final int dx, final int dy) {
        this.x += dx;
        this.y += dy;
        return this;
    }

    /**
     * Retourne la coordonnée x de la position.
     * @return   coordonnée x
     */
    public int getX() {
        return x;
    }

    /**
     * Retourne la coordonnée y de la position.
     * @return   coordonnée y
     */
    public int getY() {
        return y;
    }

    /**
     * Retourne une chaine de caractère représentant la position.
     * Sous la forme de "(x,y)"
     * @return     chaine de caractère
     */
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
