package org.formation.tpinterface;

import javafx.scene.shape.Shape;

public class Circle extends Surface implements IFXDrawable, IPrintable {

	private double rayon;

	public Circle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double getArea() {
		return rayon * rayon * Math.PI;
	}

	@Override
	public void printMe(String text) {
		System.out.println(text);

	}

	@Override
	public Shape getShape() {
		return new javafx.scene.shape.Circle(125, 125, rayon);
	}

}
