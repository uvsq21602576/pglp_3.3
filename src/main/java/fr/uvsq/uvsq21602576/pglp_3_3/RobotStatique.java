package fr.uvsq.uvsq21602576.pglp_3_3;

public class RobotStatique extends Robot implements Tourne{

	public RobotStatique(int x, int y, Direction d) {
		super(x, y, d);
	}
	
	public void tourne() {
		this.direction = this.direction.getNext();
	}

}
