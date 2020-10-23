package com.company;

import javax.swing.*;



public class Calculator extends JFrame {
 	private int current;
	private char operation;

	public Calculator() {
		super("Caclulator");
	}

	public void init() {
		JButton buttonSum = new JButton("+");
		JButton buttonMinus = new JButton("-");
		JButton buttonEquel = new JButton("=");
		JTextField input = new JTextField();

		buttonSum.setBounds(110, 30, 45, 20);
		buttonMinus.setBounds(170, 30, 45, 20);
		buttonEquel.setBounds(230, 30, 45, 20);
		input.setBounds(20, 30, 85, 20);