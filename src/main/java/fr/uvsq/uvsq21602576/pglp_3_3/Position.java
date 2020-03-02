package fr.uvsq.uvsq21602576.pglp_3_3;

public class Position {
	private int x;
	private int y;

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void changerPosition(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
}
