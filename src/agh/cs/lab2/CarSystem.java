package agh.cs.lab2;

//import javafx.scene.input.KeyCombination.ModifierValue;

public class CarSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Position position1 = new Position(1, 2);
		System.out.println(position1);
		Position position2 = new Position(-2, 1);
		System.out.println(position2);
		System.out.println(position1.add(position2)); /// mozna tam wrzucac ...,kabanosy, skarpetki i liczbe 5
		if(position2.larger(position1))
			System.out.println("True");
		else
			System.out.println("False");
		
		Car bmw = new Car();
		System.out.println(bmw.toString());
		
		MoveDirection direct = MoveDirection.Left;
		
		bmw.move(direct);
		
		System.out.println(bmw.toString());
	

	}

}
