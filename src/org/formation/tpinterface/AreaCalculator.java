package org.formation.tpinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AreaCalculator {

	private AreaCalculator() {
	}

	public static double sumArea(Surface[] tabSurface) {
		double sum = 0;
		for (Surface surface : tabSurface) {
			sum += surface.getArea();
		}
		return sum;
	}

	public static List<Surface> orderSurfaces(Surface... surfaces) {
		List<Surface> list = Arrays.asList(surfaces);
		Collections.sort(list, Collections.reverseOrder());
		return list;
	}
}
