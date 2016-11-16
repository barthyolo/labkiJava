package agh.cs.lab1;

import static java.lang.System.out;

public class CarSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Start systemu zarzadzania bmw");
		run(convertArguments(args));
		System.out.println("Stop systemu zarzadzania bmw");

	}

	private static void run(Direction[] arguments) {
		for (Direction argument : arguments) {
			if (argument != null) {
			if (argument.equals("f")) {
				out.println("Jedziemy do przodu");
			} else if (argument.equals("b")) {
				out.println("Jedziemy do tylu");
			} else if (argument.equals("r")) {
				out.println("Jedziemy w prawo");
			} else if (argument.equals("l")) {
				out.println("Jedziemy w lewo");
			}

			}
		}
	}

	private static Direction[] convertArguments(String[] args) {
		Direction[] result = new Direction[args.length];
		for (int i = 0; i < args.length; i++) {
			if (args.equals("f")) {
				result[i] = Direction.Forward;
			} else if (args.equals("b")) {
				result[i] = Direction.Backward;
			} else if (args.equals("r")) {
				result[i] = Direction.Right;
			} else if (args.equals("l")) {
				result[i] = Direction.Left;
			}
		}
		return result;
	}
}
