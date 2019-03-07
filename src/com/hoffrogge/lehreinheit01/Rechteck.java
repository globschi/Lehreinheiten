package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

/**
 * @author Kurs
 *
 */
public class Rechteck {

	private int xKoordinate;
	private int yKoordinate;

	public Rechteck(int xKoordinate, int yKoordinate) {
		this.xKoordinate = xKoordinate;
		this.yKoordinate = yKoordinate;
	}

	public void zeichnen(Graphics graphics) {

		graphics.drawLine(xKoordinate, yKoordinate, xKoordinate, yKoordinate + 100);
		graphics.drawLine(xKoordinate, yKoordinate, xKoordinate + 100, yKoordinate);
		graphics.drawLine(xKoordinate + 100, yKoordinate, xKoordinate + 100, yKoordinate + 100);
		graphics.drawLine(xKoordinate, yKoordinate + 100, xKoordinate + 100, yKoordinate + 100);
	}
}
