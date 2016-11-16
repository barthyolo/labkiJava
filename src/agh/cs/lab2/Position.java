package agh.cs.lab2;

public class Position {
	public final int x;
	public final int y;

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Position add(Position other) {
		Position result = new Position(this.x + other.x, this.y + other.y);
		return result;
	}

	public String toString() {
		return "("+ this.x + "," + this.y + ")";
	}
	
	public boolean smaller(Position other) {
		return (this.x <= other.x && this.y <= other.y);
	}

	public boolean larger(Position other) {
		return (this.x >= other.x && this.y >= other.y);
	}
	
	public boolean equals(Position other) {
		if(this == other)
			return true;
		if(!(other instanceof Position))
			return false;
		Position that = (Position) other;
		
		return (that.x == this.x && that.y == this.y);
	}
	
}
