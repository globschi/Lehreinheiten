package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit04.Quadrat;

/*
 * Zeichenfläche mit einer Größe von 800 x 800 Pixeln
 * @formatter:off
 *  
 *  0,0 ----------------------------------------- 800,0
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  0,800 --------------------------------------- 800,800
 *  
 * @formater:on 
 */
public class Zeichenflaeche extends Quadrat {

	@Override
	public void zeichnen(Graphics graphics) {
		super.zeichnen(graphics);
		Rechteck erstesrechteck = new Rechteck(200, 200);
		erstesrechteck.zeichnen(graphics);

		Rechteck zweitesrechteck = new Rechteck(200, 300);
		zweitesrechteck.zeichnen(graphics);

		Rechteck drittesrechteck = new Rechteck(300, 300);
		drittesrechteck.zeichnen(graphics);

		Rechteck viertesrechteck = new Rechteck(300, 400);
		viertesrechteck.zeichnen(graphics);

	}
}