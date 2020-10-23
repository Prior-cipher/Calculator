package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Proc
{
    public static double temp = 0;
    public static double ans = 0;
    public static char ch = '+';

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

    public static Pattern p = Pattern.compile("(([0-9]){0,}([\\.]){0,})+");

    public static double VVod(String ins)
    {
        Matcher m = p.matcher(ins);
        if(!m.matches())
    {

        ins

    }
    else {

        ch = '+';
    }

        return 1;
    }

    public static String Obrabotkaa()
    {






        return ("1");
    }
}
