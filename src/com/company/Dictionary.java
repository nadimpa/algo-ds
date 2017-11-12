package com.company;

import java.util.*;

class Dictionary {

    public static void main(String[] args) {
        Dictionary dict = new Dictionary();
        String[] argsa = {"m","mo","moc","moch","mocha","l","la","lat","latt","latte","c","ca","cat"};
        System.out.println(dict.longestWord(argsa));
    }

    public String longestWord(String[] words) {
        List<String> wordsA = Arrays.asList(words);
        String result = "";
        int countSoFar = 0;
        Collections.sort(wordsA, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if (o1.length()!=o2.length()) {
                    return o1.length()-o2.length(); //overflow impossible since lengths are non-negative
                }
                return o1.compareTo(o2);
            }
        });
        for(int i=0;i<wordsA.size();i++) {
            String str = wordsA.get(wordsA.size() -1- i);
            int j = wordsA.size()-1-i;
//            boolean flag = true;
            int count = 0;
            while(j>=0) {
                if(str.contains(wordsA.get(j))) {
                    count++;
                }
                j--;
            }
            if(count >= countSoFar) {
                countSoFar = count;
                result = str;
            }
//            countSoFar = 0;
        }
        return result;
    }
}
