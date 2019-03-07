package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

public class Quadrat1 {
	public void zeichnen(Graphics graphics) {
		Rechteck erstesrechteck = new Rechteck(50, 50);
		erstesrechteck.zeichnen(graphics);

		Rechteck zweitesrechteck = new Rechteck(150, 50);
		zweitesrechteck.zeichnen(graphics);

		Rechteck drittesrechteck = new Rechteck(50, 150);
		drittesrechteck.zeichnen(graphics);

		Rechteck viertesrechteck = new Rechteck(150, 150);
		viertesrechteck.zeichnen(graphics);

	}
}
