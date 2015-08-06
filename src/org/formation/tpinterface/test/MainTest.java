package org.formation.tpinterface.test;

import java.util.ArrayList;
import java.util.List;

import org.formation.tpinterface.*;

public class MainTest {

	public static void main(String[] args) {
		ArrayList<Surface> listeSurface = new ArrayList<>();
		listeSurface.add(new Circle(2));
		listeSurface.add(new Rectangle(2, 3));
		listeSurface.add(new Square(2));
		
		List<Surface> listeSurface2 = AreaCalculator.orderSurfaces(new Circle(4), new Circle(2), new Circle(3));
		for (Surface surface : listeSurface2) {
			System.out.println(surface.getArea());
		}
	}

}
