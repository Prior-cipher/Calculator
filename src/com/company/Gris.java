package com.company;
import javax.swing.*;
import java.awt.*;

import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Gris extends JFrame
{

    public static double temp = 0;
    public static double ans = 0;
    public static char ch = '+';

    JTextField ins = new JTextField("0");
    private JButton c = new JButton("c");
    private JButton ce = new JButton("ce");
    private JButton equal = new JButton("=");
    private JButton plus = new JButton("+");
    private JButton minus = new JButton("-");
    private JButton umno = new JButton("*");
    private JButton del = new JButton("/");
    private JLabel label = new JLabel("Input:");
    private  JOptionPane wwarn = new JOptionPane("warn");

    public static String Scet(String alpha)
    {

        temp = Double.parseDouble(alpha);
        switch (ch)
        {
            case '+':
                ans += temp;
                break;
            case '-':
                ans -= temp;
                break;
            case '*':
                ans *= temp;
                break;
            case '/':
                ans /= temp;
                break;
        }
        return ("0");
    }

    public Gris()
    {
        super("Simple Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 400, 400);
        GridBagLayout container = new GridBagLayout();
        setLayout(container);




        GridBagConstraints stroka =  new GridBagConstraints();
        Container knopki =new Container();
        knopki.setLayout(new GridLayout(0,2,0,0));



        stroka.anchor = GridBagConstraints.NORTH;
        stroka.fill   = GridBagConstraints.BOTH;
        stroka.gridheight = 1;
        stroka.gridwidth  = 1;
        stroka.gridx = 0;
        stroka.gridy = GridBagConstraints.RELATIVE;
        stroka.insets = new Insets(0, 0, 1, 1);
        stroka.ipadx = 0;
        stroka.ipady = 0;
        stroka.weightx = 1.0;
        stroka.weighty = 1.0;


        knopki.add(plus);
        knopki.add(minus);
        knopki.add(umno);
        knopki.add(del);
        knopki.add(c);
        knopki.add(ce);





        container.setConstraints(ins,stroka);

        container.setConstraints(knopki,stroka);
        container.setConstraints(equal,stroka);




        ins.setBounds(0,0,100,60);
        add(ins);
        add(knopki);

        add(equal);


        Pattern p = Pattern.compile("(([0-9]){0,}([\\.]){0,})+");


        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent plus)
            {

                Matcher m = p.matcher(ins.getText());


                if(!m.matches()) {

                    ins.setEnabled(false);
                    label.setText("Нажмите на кнопку \"Очистить\" Вводите только цифры и символ \".\"");
                }
                else {
                    ins.setText(Scet(ins.getText()));
                    ch = '+';
                }


            }

        });


        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent plus) {

                Matcher m = p.matcher(ins.getText());
                if (!m.matches())
                {

                    ins.setEnabled(false);
                    label.setText("Нажмите на кнопку \"Очистить\" Вводите только цифры и символ \".\"");
                }
                else
                    {

                    ins.setText(Scet(ins.getText()));
                    ch = '-';

                }
            }
        });

        del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent plus) {
                Matcher m = p.matcher(ins.getText());
                if (!m.matches())
                {

                    ins.setEnabled(false);
                    label.setText("Нажмите на кнопку \"Очистить\" Вводите только цифры и символ \".\"");
                }
                else
                {

                    ins.setText(Scet(ins.getText()));
                    ch = '/';

                }

            }

        });


        umno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent plus) {
                Matcher m = p.matcher(ins.getText());
                if (!m.matches())
                {

                    ins.setEnabled(false);
                    label.setText("Нажмите на кнопку \"Очистить\" Вводите только цифры и символ \".\"");
                }
                else
                {

                    ins.setText(Scet(ins.getText()));
                    ch = '*';

                }
            }

        });


        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent plus) {

                Matcher m = p.matcher(ins.getText());
                if (!m.matches())
                {

                    ins.setEnabled(false);
                    label.setText("Нажмите на кнопку \"Очистить\" Вводите только цифры и символ \".\"");
                }
                else
                {

                    Scet(ins.getText());
                    ins.setText(Double.toString(ans));
                    ans = 0;
                    ch = '+';
                    temp = 0;


                }





            }

        });
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent c)
            {

                ins.setEnabled(true);



                ins.setText(Double.toString(ans));
                ans = 0;
                temp = 0;
                ch = '+';

            }
        });

        ce.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent c)
            {
                ins.setEnabled(true);

                ins.setText("0");

                ans = 0;
                temp = 0;
                ch = '+';
            }
        });

    }
}