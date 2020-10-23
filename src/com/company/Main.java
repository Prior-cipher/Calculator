package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    public static void Calculator() {
        JFrame frame = new JFrame("Вычислятор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel label_math = new JLabel("_");
        // Кнопки для создания диалоговых окон
        JButton button_plus = new JButton("+");
        JButton button_minus = new JButton("-");
        JButton button_equal = new JButton("=");
        JButton button_multi = new JButton("x");
        JButton button_div = new JButton("/");

        JButton button_1 = new JButton("1");
        JButton button_2 = new JButton("2");
        JButton button_3 = new JButton("3");
        JButton button_4 = new JButton("4");
        JButton button_5 = new JButton("5");
        JButton button_6 = new JButton("6");
        JButton button_7 = new JButton("7");
        JButton button_8 = new JButton("8");
        JButton button_9 = new JButton("9");
        JButton button_0 = new JButton("0");

        JButton button_c = new JButton("C");
        JButton button_neg = new JButton("-x");
        JButton button_point = new JButton(".");

        JTextField input = new JTextField("");

        label_math.setBounds (10,5,500,20);
        frame.add(label_math);

        input.setBounds(20,40,500,40);
        frame.add(input);


        button_plus.setBackground(Color.GREEN);
        button_minus.setBackground(Color.getHSBColor(155,155,155));
        button_equal.setBackground(Color.ORANGE);
        button_multi.setBackground(Color.PINK);
        button_div.setBackground(Color.getHSBColor(255,255,255));
        button_equal.setForeground(Color.BLACK);


        button_minus.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        button_plus.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        button_div.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        button_multi.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        button_equal.setFont(new Font("TimesRoman", Font.PLAIN, 20));


        button_plus.setBounds(90,90,50,40);
        frame.add(button_plus);
        button_minus.setBounds(150,90,50,40);
        frame.add(button_minus);
        button_multi.setBounds(210,90,50,40);
        frame.add(button_multi);
        button_div.setBounds(270,90,50,40);
        frame.add(button_div);
        button_equal.setBounds(330,90,50,40);
        frame.add(button_equal);
        button_c.setBounds(390,90,50,40);
        frame.add(button_c);


        button_1.setBounds(90,140,50,40);
        frame.add(button_1);
        button_2.setBounds(150,140,50,40);
        frame.add(button_2);
        button_3.setBounds(210,140,50,40);
        frame.add(button_3);
        button_4.setBounds(270,140,50,40);
        frame.add(button_4);
        button_5.setBounds(330,140,50,40);
        frame.add(button_5);
        button_neg.setBounds(390,140,50,40);
        frame.add(button_neg);

        button_6.setBounds(90,190,50,40);
        frame.add(button_6);
        button_7.setBounds(150,190,50,40);
        frame.add(button_7);
        button_8.setBounds(210,190,50,40);
        frame.add(button_8);
        button_9.setBounds(270,190,50,40);
        frame.add(button_9);
        button_0.setBounds(330,190,50,40);
        frame.add(button_0);
        button_point.setBounds(390,190,50,40);
        frame.add(button_point);





        frame.setLayout(null);
        double[] operator1 = new double[1];
        String[] operation = new String[1];
        operation[0] = "";
        button_equal.setEnabled(false);
//        Действия по нажатию на кнопку "+"
        button_plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operation[0] == "") {
                    if(input.getText().length() > 0) {
                        operator1[0] = Double.parseDouble(input.getText());
                        operation[0] = "+";
                        label_math.setText(input.getText() + " + ");
                        input.setText("");
                    }
                }
                else {
                    operation[0] = "+";
                    label_math.setText(operator1[0] + " + ");
                }
                button_equal.setEnabled(true);
            }
        });

        button_minus.addActionListener(e -> { // По нажатию на кнопку -

            if (operation[0] == "") {
                if(input.getText().length() > 0) {
                    operator1[0] = Double.parseDouble(input.getText());
                    operation[0] = "-";
                    label_math.setText(input.getText() + " - ");
                    input.setText("");
                }

            }
            else {
                operation[0] = "-";
                label_math.setText(operator1[0] + " - ");
            }
            button_equal.setEnabled(true);

        });
        button_multi.addActionListener(e -> { // По нажатию на кнопку *

            if (operation[0] == "") {
                if(input.getText().length() > 0) {
                    operator1[0] = Double.parseDouble(input.getText());
                    operation[0] = "x";
                    label_math.setText(input.getText() + " x ");
                    input.setText("");
                }

            }
            else {
                operation[0] = "x";
                label_math.setText(operator1[0] + " x ");
            }
            button_equal.setEnabled(true);

        });
        button_div.addActionListener(e -> { // По нажатию на кнопку /

            if (operation[0] == "") {
                if(input.getText().length() > 0) {
                    operator1[0] = Double.parseDouble(input.getText());
                    operation[0] = "/";
                    label_math.setText(input.getText() + " / ");
                    input.setText("");
                }

            }
            else {
                operation[0] = "/";
                label_math.setText(operator1[0] + " / ");
            }
            button_equal.setEnabled(true);

        });
        button_equal.addActionListener(e -> { // По нажатию на кнопку =

            if(input.getText().length() > 0) {
                if(input.getText() == ".")
                {
                    input.setText("0.0");
                }
                double operator2 =  Double.parseDouble(input.getText());
                switch (operation[0]) {
                    case "+": {
                        double result = operator1[0] + operator2;
                        input.setText(String.valueOf(result)); // Export result
                        label_math.setText(label_math.getText() + operator2 + " = " + result);
                        break;

                    }
                    case "-": {
                        double result = operator1[0] - operator2;

                        input.setText(String.valueOf(result)); // Export result
                        label_math.setText(label_math.getText() + operator2 + " = " + result);
                        break;
                    }
                    case "x": {
                        double result = operator1[0] * operator2;

                        input.setText(String.valueOf(result)); // Export result
                        label_math.setText(label_math.getText() + operator2 + " = " + result);
                        break;
                    }
                    case "/": {
                        double result = operator1[0] / operator2;

                        input.setText(String.valueOf(result)); // Export result
                        label_math.setText(label_math.getText() + operator2 + " = " + result);
                        break;
                    }
                    default: {
//                        throw new IllegalStateException("Unknown operation! ");
                        break;
                    }
                }
                operator1[0] = 0;
                operation[0] = "";
                button_equal.setEnabled(false);
            }
        });

        button_1.addActionListener(e -> { // По нажатию на кнопку /
            input.setText(input.getText() + "1");
        });
        button_2.addActionListener(e -> { // По нажатию на кнопку /
            input.setText(input.getText() + "2");
        });
        button_3.addActionListener(e -> { // По нажатию на кнопку /
            input.setText(input.getText() + "3");
        });
        button_4.addActionListener(e -> { // По нажатию на кнопку /
            input.setText(input.getText() + "4");
        });
        button_5.addActionListener(e -> { // По нажатию на кнопку /
            input.setText(input.getText() + "5");
        });
        button_6.addActionListener(e -> { // По нажатию на кнопку /
            input.setText(input.getText() + "6");
        });
        button_7.addActionListener(e -> { // По нажатию на кнопку /
            input.setText(input.getText() + "7");
        });
        button_8.addActionListener(e -> { // По нажатию на кнопку /
            input.setText(input.getText() + "8");
        });
        button_9.addActionListener(e -> { // По нажатию на кнопку /
            input.setText(input.getText() + "9");
        });
        button_0.addActionListener(e -> { // По нажатию на кнопку /
            input.setText(input.getText() + "0");
        });
        button_c.addActionListener(e -> { // По нажатию на кнопку C
            String data = input.getText();
            input.setText(data.replaceFirst(".$",""));
        });
        button_neg.addActionListener(e -> { // По нажатию на кнопку --
            input.setText(String.valueOf(Double.parseDouble(input.getText()) * -1));
        });
        button_point.addActionListener(e -> { // По нажатию на кнопку .
            String pointOut = input.getText().replace (".", "");
            int amountOfPoint = input.getText().length () - pointOut.length ();
            if(amountOfPoint == 0)
            {
                input.setText(input.getText() + ".");
            }

        });





        frame.pack();
        frame.setSize(550, 300);
        frame.setLocation(640, 360);
        frame.setVisible(true);
    }


    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(Main::Calculator);
    }
}
