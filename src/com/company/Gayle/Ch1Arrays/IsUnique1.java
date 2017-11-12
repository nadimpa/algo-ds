package com.company.Gayle.Ch1Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class IsUnique1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<Character> hashSet = new HashSet<>();
        boolean flag = true;
        for (int i=0;i<str.length();i++) {
            if(hashSet.contains(str.charAt(i))) {
                flag = false;
                break;
            } else {
                hashSet.add(str.charAt(i));
            }
        }
        System.out.println(flag);
    }
}
