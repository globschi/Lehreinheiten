package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

public class LBlock {
	public void zeichnen(Graphics graphics) {
		Rechteck erstesrechteck = new Rechteck(50, 600);
		erstesrechteck.zeichnen(graphics);

		Rechteck zweitesrechteck = new Rechteck(150, 600);
		zweitesrechteck.zeichnen(graphics);

		Rechteck drittesrechteck = new Rechteck(250, 600);
		drittesrechteck.zeichnen(graphics);

		Rechteck viertesrechteck = new Rechteck(250, 500);
		viertesrechteck.zeichnen(graphics);

	}
}
