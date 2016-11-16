package agh.cs.lab2;

import java.util.LinkedList;
import java.util.List;

import agh.cs.lab4.IWorldMap;

public class RectangularMap implements IWorldMap {

	List<Car> cars = new LinkedList<>();

	Position downLeftCorner = new Position(0, 0);
	Position topRightCorner;

	public RectangularMap(int width, int height) {
		this.topRightCorner = new Position(width, height);
	}

	@Override
	public boolean canMoveTo(Position position) {
		return (position.larger(this.downLeftCorner) && position.smaller(this.topRightCorner));
	}

	@Override
	public boolean add(Car car) {
		if (!isOccupied(car.getPosition())) {
			cars.add(car);
			return true;
		}
		return false;
	}

	@Override
	public void run(MoveDirection[] directions) {
		for(int i=0; i<cars.size(); i++) {
			cars.get(i%cars.size()).move(directions[i]);
		}
	}

	@Override
	public boolean isOccupied(Position position) {
		for(Car car : cars) {
			if(car.getPosition().equals(position)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Object objectAt(Position position) {
		for (Car car : cars) {
			if (car.getPosition().equals(position))
				return car;
		}
		return "";
	}

}
