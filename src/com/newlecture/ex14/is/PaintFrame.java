package com.newlecture.ex14.is;

import java.awt.Graphics;

import javax.swing.JFrame;

public class PaintFrame extends JFrame {
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawLine(0, 0, 200, 200);
		super.paint(g);
	}
}
