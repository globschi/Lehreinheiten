package com.hoffrogge.tetris;

import java.awt.Graphics;
import java.util.List;

import com.hoffrogge.lehreinheit03.Farbe;
import com.hoffrogge.lehreinheit04.Punkt;

public class Blitz2 extends AllgemeinerTetromino {
	private Punkt mittelpunkt;
	int xBlitz2 = 25;
	int yBlitz2 = 275;

	private Farbe fuellFarbe = new Farbe(20, 155, 0);

	public void zeichnen(Graphics graphics) {
		super.zeichneRechteck(graphics, xBlitz2, yBlitz2, fuellFarbe);
		super.zeichneRechteck(graphics, xBlitz2, yBlitz2 + getKantenlaenge(), fuellFarbe);
		super.zeichneRechteck(graphics, xBlitz2 + getKantenlaenge(), yBlitz2 + getKantenlaenge(), fuellFarbe);
		super.zeichneRechteck(graphics, xBlitz2 + getKantenlaenge(), yBlitz2 + getKantenlaenge() + getKantenlaenge(),
				fuellFarbe);

	}

	@Override
	public void setMittelpunkt(Punkt mittelpunkt) {
		this.mittelpunkt = mittelpunkt;

	}

	@Override
	public Punkt getMittelPunkt() {
		return mittelpunkt;
	}

	@Override
	public void setDurchmesser(int d) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compareTo(TetrominoSpielstein o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHoechstesY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTiefstesY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getKanteLinksX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getKanteRechtsX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void bewegeNachUnten() {
		// TODO Auto-generated method stub

	}

	@Override
	public void bewegeNachRechts() {
		// TODO Auto-generated method stub

	}

	@Override
	public void bewegeNachLinks() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rotiereNachLinks() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rotiereNachRechts() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean faelltAuf(TetrominoSpielstein tetrominoSpielstein) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<TetrominoSpielstein> getViertelBloecke() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Farbe getFuellFarbe() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFuellFarbe(Farbe farbe) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setLinienFarbe(Farbe farbe) {
		// TODO Auto-generated method stub

	}
}
