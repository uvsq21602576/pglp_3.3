package fr.uvsq.uvsq21602576.pglp_3_3;

import java.util.ArrayList;

/**
 * Classe représentant un terrain.
 * Possède plusieurs robots.
 * @author Flora
 */
public class Terrain {
    /**
     * Liste de robots présents sur le terrain.
     */
    private ArrayList<Robot> listRobots;

    /**
     * Constructeur.
     * Crée un terrain vide.
     */
    public Terrain() {
        listRobots = new ArrayList<Robot>();
    }

    /**
     * Ajoute un robot au terrain.
     * @param r    Robot
     */
    public void ajoutRobot(final Robot r) {
        listRobots.add(r);
    }

    /**
     * Avance tous les robots le pouvant.
     */
    public void avanceTous() {
        for (Robot r : listRobots) {
            if (r instanceof Avance) {
                ((Avance) r).avance();
            }
        }
    }

    /**
     * Tourne tous les robots le pouvant.
     */
    public void tourneTous() {
        for (Robot r : listRobots) {
            if (r instanceof Tourne) {
                ((Tourne) r).tourne();
            }
        }
    }

    /**
     * Retourne la position du robot présent à l'indice index.
     * @param index    indice dans la liste
     * @return position du robot
     */
    public Position getPosition(final int index) {
        return listRobots.get(index).getPosition();
    }

    /**
     * Retourne la direction du robot présent à l'indice index.
     * @param index    indice dans la liste
     * @return direction du robot
     */
    public Direction getDirection(final int index) {
        return listRobots.get(index).getDirection();
    }
}
