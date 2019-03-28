package com.hoffrogge.tetris;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit01.Rechteck;
import com.hoffrogge.lehreinheit03.Farbe;

//in diese Klasse können Methoden rein, die bei allen Tetrominos identisch sind, dann muss nicht jede Klasse sie implementieren
public abstract class AllgemeinerTetromino implements TetrominoSpielstein {

	private int kantenlaenge = 50;
	private Farbe schwarz = new Farbe(0, 0, 0);

	public Farbe getLinienFarbe() {
		return schwarz;
	}

	protected int getKantenlaenge() {
		return kantenlaenge;
	}

	protected void zeichneRechteck(Graphics graphics, int x, int y, Farbe fuellFarbe) {

		graphics.setColor(fuellFarbe.konvertiereZuColor());

		Rechteck erstesrechteck = new Rechteck(x, y, kantenlaenge);

		erstesrechteck.zeichnen(graphics);

		graphics.setColor(schwarz.konvertiereZuColor());
		graphics.drawRect(x, y, kantenlaenge, kantenlaenge);
	}

}