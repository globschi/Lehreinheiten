package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit03.Farbe;

public class TBlock {

	public void zeichnen(Graphics graphics) {

		Rechteck erstesrechteck = new Rechteck(510, 75);
		erstesrechteck.zeichnen(graphics);

		Rechteck zweitesrechteck = new Rechteck(510, 175);
		zweitesrechteck.zeichnen(graphics);

		Rechteck drittesrechteck = new Rechteck(510, 275);
		drittesrechteck.zeichnen(graphics);

		Rechteck viertesrechteck = new Rechteck(410, 175);
		viertesrechteck.zeichnen(graphics);

	}

	private Farbe getFuellFarbe() {
		// TODO Auto-generated method stub
		return null;
	}
}
