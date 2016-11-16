package agh.cs.lab2;

import java.util.ArrayList;

public class OptionsParser {
	private ArrayList<MoveDirection> moveDirections;

	public OptionsParser() {
		this.moveDirections = new ArrayList<MoveDirection>();
	}

	public ArrayList<MoveDirection> parser(String[] strings) {

		for (String arg : strings) {

			if (arg.equals("f")) {
				moveDirections.add(MoveDirection.Forward);
			} else if (arg.equals("b")) {
				moveDirections.add(MoveDirection.Backward);
			} else if (arg.equals("l")) {
				moveDirections.add(MoveDirection.Left);
			} else if (arg.equals("r")) {
				moveDirections.add(MoveDirection.Right);
			}

		}
		return moveDirections;

	}
}
