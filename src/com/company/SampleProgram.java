package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class SampleProgram {

    public int average(String s) {
        String[] parts = s.split(",");
        int total = 0;
        for(int i = 0; i < parts.length; i++) {
            int curr = Integer.parseInt(parts[i]);
            total += curr;
        }
        return (int)Math.ceil((double)total/(double)parts.length);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);    //Instantiation Of Scanner Object
//        int a=sc.nextInt();          //reads integer
//        double b=sc.nextDouble();    //reads double
        String str=sc.nextLine();    //reads String
        SampleProgram sampleProgram = new SampleProgram();
        System.out.println(sampleProgram.average(str));
    }
}
