package com.company;
import javax.swing.*;

public class Calculator {
    //создание переменных
    long result; //результат вычислений
    Character operation; //выбранная операция
    String conventor = "Enter your number"; //преобразование результата в текст

    //Создание объектов интерфейса
    JFrame frame = new JFrame ("Calculating Integers");
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    JButton zero = new JButton("0");
    JButton scratch = new JButton("C");

    JTextField text = new JTextField(conventor);

    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    JButton division = new JButton("/");
    JButton times = new JButton("*");
    JButton equals = new JButton("=");
    public void restrict(){
        text.setText("Press the C-button mazafaka, and you use only buttons, OKAY?!!111");
        result = 0;
        operation = null;
    }
    //Методы для элементов интерфейса
    public void createNumber(char num) {
        if (!conventor.equals(text.getText())) {
            restrict();
        } else {
            if (conventor.equals("Enter your number")) {
                conventor = Character.toString(num);
            } else {
                conventor += Character.toString(num);
            }
            text.setText(conventor);
        }
    }

    public void countNow(){
        if(!conventor.equals("Enter your number")) {
            if (operation == null) {
                result += Long.parseLong(conventor);
            } else {
                switch (operation) {
                    case ('+'):
                        result += Long.parseLong(conventor);
                        break;
                    case ('-'):
                        result -= Long.parseLong(conventor);
                        break;
                    case ('*'):
                        result *= Long.parseLong(conventor);
                        break;
                    case ('/'):
                        if (Long.parseLong(conventor) != 0) {
                            result /= Long.parseLong(conventor);
                        }
                        break;
                }
            }
        }
    }
    public void createOperation (Character change){
        if (!conventor.equals(text.getText())){
            restrict();
        } else {
            countNow();
            conventor = "Enter your number";
            text.setText(conventor);
            operation = change;
        }
    }

    public void countEVERYOOONE(){
        if (!conventor.equals(text.getText())){
            restrict();
        } else {
            countNow();
            conventor = Long.toString(result);
            text.setText(conventor);
            result = 0;
            operation = null;
        }
    }

    //Присваивание методов кнопочкам
    public void createAndShowGUI() {

        one.addActionListener(arg1 -> createNumber('1'));

        two.addActionListener(arg1 -> createNumber('2'));

        three.addActionListener(arg1 -> createNumber('3'));

        four.addActionListener(arg1 -> createNumber('4'));

        five.addActionListener(arg1 -> createNumber('5'));

        six.addActionListener(arg1 -> createNumber('6'));

        seven.addActionListener(arg1 -> createNumber('7'));

        eight.addActionListener(arg1 -> createNumber('8'));

        nine.addActionListener(arg1 -> createNumber('9'));

        zero.addActionListener(arg1 -> createNumber('0'));

        plus.addActionListener(arg1 -> createOperation('+'));

        minus.addActionListener(arg1 -> createOperation('-'));

        times.addActionListener(arg1 -> createOperation('*'));

        division.addActionListener(arg1 -> createOperation('/'));


        equals.addActionListener(arg1 -> countEVERYOOONE());

        scratch.addActionListener(arg1 -> {
            operation = null;
            result = 0;
            conventor = "Enter your number";
            text.setText(conventor);
        });


        frame.setLocation(480,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Java Beans

        one.setBounds(0, 185, 100, 100);
        two.setBounds(100, 185, 100, 100);
        three.setBounds(200, 185, 100, 100);
        four.setBounds(0, 285, 100, 100);
        five.setBounds(100, 285, 100, 100);
        six.setBounds(200, 285, 100, 100);
        seven.setBounds(0, 385, 100, 100);
        eight.setBounds(100, 385, 100, 100);
        nine.setBounds(200, 385, 100, 100);
        zero.setBounds(0, 115, 300, 69);
        equals.setBounds(300, 285, 100, 200);
        times.setBounds(300, 235, 50, 50);
        division.setBounds(350, 235, 50, 50);
        plus.setBounds(300, 185, 50, 50);
        minus.setBounds(350, 185, 50, 50);
        text.setBounds(10, 10, 380, 95);
        scratch.setBounds(301, 115, 99, 69);

        frame.add(one);
        frame.add(two);
        frame.add(three);
        frame.add(four);
        frame.add(five);
        frame.add(six);
        frame.add(seven);
        frame.add(eight);
        frame.add(nine);
        frame.add(zero);
        frame.add(equals);
        frame.add(plus);
        frame.add(minus);
        frame.add(times);
        frame.add(division);
        frame.add(text);
        frame.add(scratch);

        frame.setSize(416, 520);
        frame.setLayout(null);

        frame.setVisible(true);
    }

}