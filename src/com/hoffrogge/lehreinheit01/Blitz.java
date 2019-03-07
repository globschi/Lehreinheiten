package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

public class Blitz {

	public void zeichnen(Graphics graphics) {
		Rechteck erstesrechteck = new Rechteck(400, 400);
		erstesrechteck.zeichnen(graphics);

		Rechteck zweitesrechteck = new Rechteck(500, 400);
		zweitesrechteck.zeichnen(graphics);

		Rechteck drittesrechteck = new Rechteck(500, 500);
		drittesrechteck.zeichnen(graphics);

		Rechteck viertesrechteck = new Rechteck(600, 500);

		viertesrechteck.zeichnen(graphics);

	}

}
