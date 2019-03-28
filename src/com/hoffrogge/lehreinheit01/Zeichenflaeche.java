package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit04.Quadrat;
import com.hoffrogge.tetris.Blitz;
import com.hoffrogge.tetris.Blitz2;
import com.hoffrogge.tetris.LBlock;
import com.hoffrogge.tetris.LBlock2;
import com.hoffrogge.tetris.Linie;
import com.hoffrogge.tetris.Quadrat1;
import com.hoffrogge.tetris.TBlock;

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
		new Blitz().zeichnen(graphics);
		new Quadrat1().zeichnen(graphics);
		new LBlock().zeichnen(graphics);
		new LBlock2().zeichnen(graphics);
		new Blitz2().zeichnen(graphics);
		new Linie().zeichnen(graphics);
		new TBlock().zeichnen(graphics);

	}
}