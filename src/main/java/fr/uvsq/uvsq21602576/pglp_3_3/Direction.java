package fr.uvsq.uvsq21602576.pglp_3_3;

public enum Direction {
	OUEST(-1,0),
	NORD(0,-1),
	EST(+1,0),
	SUD(0,+1);
	
	private int dx;
	private int dy;
	
	Direction(int x, int y) {
		this.dx = x;
		this.dy = y;
	}
	
	public int getDx() {
		return dx;
	}
	
	public int getDy() {
		return dy;
	}
	
	public Direction getNext() {
		int index=0;
		for (Direction d : Direction.values()) {
			if (d.equals(this)){
				return Direction.values()[(index+1)%Direction.values().length];
			}
			index++;
		}
		return this;
	}

}
