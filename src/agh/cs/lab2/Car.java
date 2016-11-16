package agh.cs.lab2;

import agh.cs.lab4.IWorldMap;

public class Car {
	private MapDirection direction;
	private Position position;
	private IWorldMap map;

	public Car() {
		this.position = new Position(2, 2);
		this.direction = MapDirection.North;
	}

	public String toString() {
		return "Car [direction=" + direction + ", position=" + position + "]";
	}

	public Car(IWorldMap map) {
		this.map = map;
		this.position = new Position(2, 2);
		this.direction = MapDirection.North;
	}

	public Car(IWorldMap map, int x, int y) {
		this.map = map;
		this.position = new Position(x, y);
		this.direction = MapDirection.North;
	}

	public Position getPosition() {
		return position;
	}

	public void move(MoveDirection direct) {

		/*
		 * if(direct.equals(MoveDirection.Left)) { this.direction =
		 * this.direction.previous(); } else
		 * if(direct.equals(MoveDirection.Right)) { this.direction =
		 * this.direction.next(); }
		 */

		// Position newPosition = getPosition(car);
		if (map.canMoveTo(this.getPosition())) {
			switch (direct) {
			case Right:
				this.direction = this.direction.next();
				break;
			case Left:
				this.direction = this.direction.previous();
				break;
			case Forward:
				break;
			case Backward:
				break;
			default:
				break;
			}
		}
	}
}
