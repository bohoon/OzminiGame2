package com.kh.model.vo;

import java.awt.Image;

import javax.swing.JLabel;

public class M_Garbage {
	private int Gx;
	private int Gy;
	
	public M_Garbage(int Gx, int Gy) {
		this.Gx = Gx;
		this.Gy = Gy;
		
	}

	public int getX() {
		return Gx;
	}

	public void setX(int x) {
		this.Gx = Gx;
	}

	public int getY() {
		return Gy;
	}

	public void setY(int y) {
		this.Gy = Gy;
	}
	
}