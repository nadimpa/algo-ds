package com.company.LeetCode;

import java.math.BigInteger;

public class ComplexNumberMultiplication {
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(2);
        String s = "abcdi";
        s.split("i");
        int aa=1;
         s = "" + aa;
        ComplexNumberMultiplication complexNumberMultiplication = new ComplexNumberMultiplication();
        complexNumberMultiplication.complexNumberMultiply("1+1i","1+1i");

    }

    public String complexNumberMultiply(String a, String b) {
        String[] parts1 = a.split("\\+");
        String[] parts2 = b.split("\\+");
        int a1 = Integer.parseInt(parts1[0]);
        int b1 = Integer.parseInt(parts1[1].split("i")[0]);
        int a2 = Integer.parseInt(parts2[0]);
        int b2 = Integer.parseInt(parts2[1].split("i")[0]);

        int intSum = a1*a2 -b1*b2;
        int complexSum = a1*b2 + a2*b1;

        String result = "" + intSum + "+" + complexSum + "i";
        return result;

    }
}
