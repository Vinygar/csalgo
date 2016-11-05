package strassen;

import java.util.*;

public class Strassen {

    public static void main(String[] args) {
        int a00, a01, a10, a11;
        int b00, b01, b10, b11;
        int m1, m2, m3, m4, m5, m6, m7;
        int ans, ans2, ans3, ans4;

        Scanner i = new Scanner(System.in);
        System.out.println("Enter A00: ");
        a00 = i.nextInt();
        System.out.println("Enter A01: ");
        a01 = i.nextInt();
        System.out.println("Enter A10: ");
        a10 = i.nextInt();
        System.out.println("Enter A11: ");
        a11 = i.nextInt();
        System.out.println("Enter B00: ");
        b00 = i.nextInt();
        System.out.println("Enter B01: ");
        b01 = i.nextInt();
        System.out.println("Enter B10: ");
        b10 = i.nextInt();
        System.out.println("Enter B11: ");
        b11 = i.nextInt();
        System.out.println("|" + a00 + " " + a01 + "|" + " " + "|" + b00 + " " + b01 + "|");
        System.out.println("|" + a10 + " " + a11 + "|" + " " + "|" + b10 + " " + b11 + "|");

        //Formula
        m1 = (a00 + a11) * (b00 + b11);
        m2 = (a10 + a11) * b00;
        m3 = a00 * (b01 - b11);
        m4 = a11 * (b10 - b00);
        m5 = (a00 + a01) * b11;
        m6 = (a10 - a00) * (b00 + b01);
        m7 = (a01 - a11) * (b10 + b11);

        //Formula
        ans = m1 + m4 - m5 + m7;
        ans2 = m3 + m5;
        ans3 = m2 + m4;
        ans4 = m1 + m3 - m2 + m6;

        //Output
        System.out.println(ans + " " + ans2);
        System.out.println(ans3 + " " + ans4);

    }

}