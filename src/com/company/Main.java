package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionListener;
public  class Main


{
    public static String Scet(String alpha)
    {

        temp=Double.parseDouble(alpha) ;
        switch (ch)
        {
            case '+':
                ans+=temp;
                break;
            case '-':
                ans-=temp;
                break;
            case '*':
                ans*=temp;
                break;
            case '/':
                ans/=temp;
                break;
        }
        return ("0");
    }

    public  static double temp =0;
    public static double ans=0;
    public  static char ch ='+';

    public static void main(String[] args)
    {
	// write your code here
    Gris app = new Gris();
    app.setVisible(true);
    }







}

