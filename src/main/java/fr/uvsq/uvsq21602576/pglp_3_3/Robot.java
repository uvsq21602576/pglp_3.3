package fr.uvsq.uvsq21602576.pglp_3_3;



public abstract class Robot {
	protected Position position;
	protected Direction direction;

	public Robot(int x, int y, Direction d) {
		this.position = new Position(x,y);
		this.direction = d;
	}
	
	public Direction getDirection() {
		return this.direction;
	}
	
	public Position getPosition() {
		return new Position(this.position.getX(),this.position.getY());
	}

}
