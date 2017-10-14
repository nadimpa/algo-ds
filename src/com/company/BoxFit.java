package com.company;

import java.util.Scanner;

public class BoxFit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numPackages = Integer.parseInt(sc.nextLine().split(";")[0]);
        int count = 0;
        for(int i=0;i<numPackages;i++) {
            String line = sc.nextLine();
            int R = Integer.parseInt(line.split(";")[0].split(",")[0]);
            int N = Integer.parseInt(line.split(";")[0].split(",")[1]);
            int L = Integer.parseInt(line.split(";")[0].split(",")[2]);
            if(N==3) {
                if(L <= ((double)2*(double)R*(0.866))) {
                    count++;
                }
            } else {
                if(L <= ((double)(2*R)/1.41421)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
