package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

public class LBlock2 {
	public void zeichnen(Graphics graphics) {
		Rechteck erstesrechteck = new Rechteck(300, 50);
		erstesrechteck.zeichnen(graphics);

		Rechteck zweitesrechteck = new Rechteck(300, 150);
		zweitesrechteck.zeichnen(graphics);

		Rechteck drittesrechteck = new Rechteck(300, 250);
		drittesrechteck.zeichnen(graphics);

		Rechteck viertesrechteck = new Rechteck(400, 50);
		viertesrechteck.zeichnen(graphics);

	}
}
