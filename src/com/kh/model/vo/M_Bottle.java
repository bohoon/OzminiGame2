package com.kh.model.vo;

import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.kh.view.MiniGameView;

public class M_Bottle extends M_Garbage{
	MiniGameView mgv = new MiniGameView(mf, p);
	Image image;
	JLabel label;
	int random1 = new Random().nextInt(5)+1;

	public M_Bottle(int Gx, int Gy) {
		super(Gx,Gy);
		image = new ImageIcon(""+ "png").getImage().getScaledInstance(40, 40, 0);
		
		label = new JLabel(new ImageIcon(image));
		if(random1 == 1) {
			label.setBounds(10,10,40,40);
		}else if(random1 == 2) {
			label.setBounds(20,20,40,40);
		}else if(random1 == 3) {
			label.setBounds(30,30,40,40);
		}else if(random1 == 4) {
			label.setBounds(40,40,40,40);
		}else if(random1 == 5) {
			label.setBounds(50,50,40,40);
		}
		
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

}
