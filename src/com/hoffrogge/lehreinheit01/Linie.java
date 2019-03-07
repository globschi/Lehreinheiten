package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

public class Linie {
	public void zeichnen(Graphics graphics) {
		Rechteck erstesrechteck = new Rechteck(650, 50);
		erstesrechteck.zeichnen(graphics);

		Rechteck zweitesrechteck = new Rechteck(650, 150);
		zweitesrechteck.zeichnen(graphics);

		Rechteck drittesrechteck = new Rechteck(650, 250);
		drittesrechteck.zeichnen(graphics);

		Rechteck viertesrechteck = new Rechteck(650, 350);
		viertesrechteck.zeichnen(graphics);

	}
}
