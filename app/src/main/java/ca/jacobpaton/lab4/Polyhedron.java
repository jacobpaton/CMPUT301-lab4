package ca.jacobpaton.lab4;

public class Polyhedron extends Shape{
	protected int num_sides;
	public Polyhedron(){
		num_sides = 10;
	}
	public Polyhedron(int sides){
		num_sides = sides;
	}
}
