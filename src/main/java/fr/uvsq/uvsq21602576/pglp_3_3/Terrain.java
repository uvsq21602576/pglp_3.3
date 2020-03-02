package fr.uvsq.uvsq21602576.pglp_3_3;

import java.util.ArrayList;

public class Terrain {
	private ArrayList<Robot> listRobots;

	public Terrain() {
		listRobots = new ArrayList<Robot>();
	}
	
	public void ajoutRobot(Robot R) {
		listRobots.add(R);
	}
	
	public void avanceTous() {
		for(Robot r : listRobots) {
			if(r instanceof Avance) {
				((Avance) r).avance();
			}
		}
	}
	
	public void tourneTous() {
		for(Robot r : listRobots) {
			if(r instanceof Tourne) {
				((Tourne) r).tourne();
			}
		}
	}
	
	public Position getPosition(int index) {
		return listRobots.get(index).getPosition();
	}
	
	public Direction getDirection(int index) {
		return listRobots.get(index).getDirection();
	}

}
