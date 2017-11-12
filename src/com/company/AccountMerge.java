//package com.company;
//
//import java.util.*;
//
//public class AccountMerge {
//    public static void main(String[] args) {
//        AccountMerge am = new AccountMerge();
//
////        am.accountsMerge();
//    }
//
//    public List<List<String>> accountsMerge(List<List<String>> accounts) {
//        HashMap<String, Integer> map = new HashMap<String, Integer>();
//        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
//        for(int i=0;i<accounts.size();i++) {
//            ArrayList<String> al = (ArrayList<String>) accounts.get(i);
//            String name = al.get(0);
//            int index = -1;
//
//            for(int j =1;j<al.size();j++) {
//                if(map.containsKey(al.get(j))) {
//                    index = map.get(al.get(j));
//                    map.values().removeAll(Collections.singleton(i));
//                    break;
//                } else {
//                    map.put(al.get(j), i);
//                }
//            }
//
//            if(index >= 0) {
////                map.replaceAll();
//            }
//        }
////    }
////}
