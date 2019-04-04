package com.hoffrogge.lehreinheit07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;

public class DemoKeyListener implements KeyListener {

	private JLabel textLabel;
	int zahl;
	int zahl1;
	int zahl2;
	int zahl3;

	public DemoKeyListener(JLabel textLabel) {
		this.textLabel = textLabel;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		gebeTasteAus(e, "gedrückt");

		/* Mit der Esc-Taste das Programm beenden */
		if (KeyEvent.VK_ESCAPE == e.getKeyCode())
			System.exit(0);
		if (KeyEvent.VK_0 == e.getKeyCode())
			zahl = zahl + 0;
		if (KeyEvent.VK_1 == e.getKeyCode())
			zahl = zahl * 10 + 1;
		if (KeyEvent.VK_2 == e.getKeyCode())
			zahl = zahl * 10 + 2;
		if (KeyEvent.VK_3 == e.getKeyCode())
			zahl = zahl * 10 + 3;
		if (KeyEvent.VK_4 == e.getKeyCode())
			zahl = zahl * 10 + 4;
		if (KeyEvent.VK_5 == e.getKeyCode())
			zahl = zahl * 10 + 5;
		if (KeyEvent.VK_6 == e.getKeyCode())
			zahl = zahl * 10 + 6;
		if (KeyEvent.VK_7 == e.getKeyCode())
			zahl = zahl * 10 + 7;
		if (KeyEvent.VK_8 == e.getKeyCode())
			zahl = zahl * 10 + 8;
		if (KeyEvent.VK_9 == e.getKeyCode())
			zahl = zahl * 10 + 9;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		gebeTasteAus(e, "losgelassen");
	}

	private void gebeTasteAus(KeyEvent e, String eventArt) {
		textLabel.setText("gesamt " + zahl);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// nichts machen
	}

	public void Zahl1(KeyEvent e) {
		if (KeyEvent.VK_ENTER == e.getKeyCode()) {
			zahl1 = zahl;
			zahl = 0;
		}
		if (KeyEvent.VK_SPACE == e.getKeyCode()) {
			zahl2 = zahl;
			zahl = zahl1 + zahl2;
		}

	}
}