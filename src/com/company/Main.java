package com.company;
import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("calc");
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton equal = new JButton("=");
        JTextField field = new JTextField();
        plus.setBounds(1,21,100,20);
        minus.setBounds(101, 21, 100,20);
        field.setBounds(1,1,200,20);
        equal.setBounds(1,41,200,20);
        frame.add(plus);
        frame.add(minus);
        frame.add(field);
        frame.add(equal);
        frame.setSize(218,101);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
