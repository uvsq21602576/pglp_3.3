package fr.uvsq.uvsq21602576.pglp_3_3;

public class RobotMobile extends Robot implements Avance, Tourne{

	public RobotMobile(int x, int y, Direction d) {
		super(x, y, d);
	}
	
	public void tourne() {
		this.direction = this.direction.getNext();
	}
	
	public void avance() {
		this.position.changerPosition(this.direction.getDx(), this.direction.getDy());
	}

}
