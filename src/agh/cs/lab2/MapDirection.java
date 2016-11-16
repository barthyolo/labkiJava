package agh.cs.lab2;

public enum MapDirection {
	North,
	East,
	South,
	West;
	
	public String toString() {
		switch(this) {
	     	case North: 
	     		return "N";
	     	case South: 
	     		return "S";
	     	case West:
	     		return "W";
	     	case East:
	     		return "E";
	     	default:
	     		return "Nieznany kierunek";	  
		}
	}
	
	public MapDirection next() {
		switch(this) {
			case North:
				return East;
			case East:
				return South;
			case South:
				return West;
			case West:
				return North;
			default:
				return null;
		}
	}
	
	public MapDirection previous() {
		/*
		switch(this) {
			case North:
				return West;
			case East:
				return North;
			case South:
				return East;
			case West:
				return South;
			default:
				return null;
		}
		*/
		return MapDirection.values()[(this.ordinal()+3)%4];
	}
	
}
