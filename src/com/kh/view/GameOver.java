package com.kh.view;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.kh.model.vo.Score;


public class GameOver extends JPanel{
	private JPanel startPage;
	private MainView mf;
	private ArrayList list;
	public GameOver(MainView mf,ArrayList list) {
		this.startPage = this;
		this.mf = mf;
		this.list = list;

		this.setLocation(0, 0);
		this.setSize(360, 640);
		this.setLayout(null);


		this.setBackground(new Color(0, 0, 0, 0));  

		JLabel label = new JLabel(new ImageIcon(new ImageIcon("src\\image\\minigame\\GameOver1.png").getImage().getScaledInstance(360, 640, 0)));
		label.setLayout(null);
		label.setBounds(0, 0, 360, 640);
		label.setBackground(new Color(0, 0, 0, 0));
		
		JLabel TimeOver = new JLabel("T I M E O V E R");
		TimeOver.setBounds(75, 100, 240, 100);
		JTextField tf1 = new JTextField(100);
		tf1.setBounds(0, 0, 300, 300);
		TimeOver.setFont(new Font("Arial", Font.BOLD, 30));
		JLabel TimeOver1 = new JLabel("������");
		TimeOver.setForeground(Color.WHITE);
		JLabel label2 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\�ٴټ�gameover.png").getImage().getScaledInstance(360, 640, 0)));
		label2.setBounds(0, 0, 360, 640);
		
		label.add(TimeOver);
		this.add(label);
		this.add(label);
		mf.add(this);
		mf.revalidate();
	}

}
