package fr.uvsq.uvsq21602576.pglp_3_3;



public class Robot {
	private Position position;
	private Direction direction;

	public Robot(int x, int y, Direction d) {
		this.position = new Position(x,y);
		this.direction = d;
	}
	
	public void tourne() {
		this.direction = this.direction.getNext();
	}
	
	public void avance() {
		this.position.changerPosition(this.direction.getDx(), this.direction.getDy());
	}
	
	public Direction getDirection() {
		return this.direction;
	}
	
	public Position getPosition() {
		return new Position(this.position.getX(),this.position.getY());
	}

}
