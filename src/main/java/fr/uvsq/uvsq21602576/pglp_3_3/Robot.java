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
	
	public Direction getDirection() {
		return this.direction;
	}

}
