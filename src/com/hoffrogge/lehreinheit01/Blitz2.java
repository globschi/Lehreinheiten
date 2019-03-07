package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

public class Blitz2 {
	public void zeichnen(Graphics graphics) {
		Rechteck erstesrechteck = new Rechteck(25, 275);
		erstesrechteck.zeichnen(graphics);

		Rechteck zweitesrechteck = new Rechteck(25, 375);
		zweitesrechteck.zeichnen(graphics);

		Rechteck drittesrechteck = new Rechteck(125, 375);
		drittesrechteck.zeichnen(graphics);

		Rechteck viertesrechteck = new Rechteck(125, 475);
		viertesrechteck.zeichnen(graphics);

	}
}
