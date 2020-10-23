package culculator;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class Main{
  private int current;
  static public char operation;

    public static void main(String[] args){
        JFrame f1 = new JFrame("Kill me");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setBounds(400,400,600,600);
        JLabel l1 = new JLabel("fck");
        JButton b1 = new JButton("1");
        b1.setActionCommand("1");
        JButton b2 = new JButton("2");
        b2.setActionCommand("2");
        JButton b3 = new JButton("3");
        b3.setActionCommand("3");
        JButton b4 = new JButton("4");
        b4.setActionCommand("4");
        JButton b5 = new JButton("5");
        b5.setActionCommand("5");
        JButton b6 = new JButton("6");
        b6.setActionCommand("6");
        JButton b7 = new JButton("7");
        b7.setActionCommand("7");
        JButton b8 = new JButton("8");
        b8.setActionCommand("8");
        JButton b9 = new JButton("9");
        b9.setActionCommand("9");
        JButton b0 =  new JButton("0");
        b0.setActionCommand("0");
        JButton b10 = new JButton("+");
        JButton b11 = new JButton("-");
        JButton b12 = new JButton("=");
        JTextField t1 = new JTextField();


        b1.setBounds(0,0,50,50);
        b2.setBounds(52,0,50,50);
        b3.setBounds(104,0,50,50);
        b4.setBounds(0,52,50,50);
        b5.setBounds(52,52,50,50);
        b6.setBounds(104,52,50,50);
        b7.setBounds(0,104,50,50);
        b8.setBounds(52,104,50,50);
        b9.setBounds(104,104,50,50);
        b0.setBounds(52,156,50,50);
        b10.setBounds(0,156,50,50);
        b11.setBounds(104,156,50,50);
        b12.setBounds(156,52,50,50);
        t1.setBounds(208,0,208,208);

        f1.getContentPane().add(b1);
        f1.getContentPane().add(b2);
        f1.getContentPane().add(b3);
        f1.getContentPane().add(b4);
        f1.getContentPane().add(b5);
        f1.getContentPane().add(b6);
        f1.getContentPane().add(b7);
        f1.getContentPane().add(b8);
        f1.getContentPane().add(b9);
        f1.getContentPane().add(b0);
        f1.getContentPane().add(b10);
        f1.getContentPane().add(b11);
        f1.getContentPane().add(b12);
        f1.getContentPane().add(t1);


        l1.setBounds (10,5,500,20);
        f1.setLayout(null);
        f1.setVisible(true);




        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.operation = operation;
            }
        });

    }








}
