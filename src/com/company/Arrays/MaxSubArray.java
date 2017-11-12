package com.company.Arrays;

import java.util.*;

public class MaxSubArray {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<Integer>(
                Arrays.asList(24831, 53057, 19790, -10679, 77006, -36098, 75319, -45223, -56760, -86126, -29506, 76770, 29094, 87844, 40534, -15394, 18738, 59590, -45159, -64947, 7217, -55539, 42385, -94885, 82420, -31968, -99915, 63534, -96011, 24152, 77295));
        MaxSubArray maxSubArray = new MaxSubArray();
        ArrayList<Integer> result = maxSubArray.maxset(input);
        result.get(0);

    }

    public ArrayList<Integer> maxset(ArrayList<Integer> a) {
        ArrayList<Integer> resultSet = new ArrayList<Integer>();
        long maxResult = 0;
        ArrayList<Integer> resultSetInter = new ArrayList<Integer>();
        long maxResultInter = 0;
        for(int i=0;i<a.size();i++) {
            if(a.get(i) < 0) {
                if(maxResultInter > maxResult) {
                    resultSet = (ArrayList<Integer>)resultSetInter.clone();
                    maxResult = maxResultInter;
                } else if((maxResultInter == maxResult) && (resultSetInter.size() > resultSet.size())) {
                    resultSet = (ArrayList<Integer>)resultSetInter.clone();
//                    maxResultInter = 0;
                }
                maxResultInter = 0;
                resultSetInter.clear();
            } else {
                resultSetInter.add(a.get(i));
                maxResultInter += a.get(i);
            }
        }
        if(maxResultInter > maxResult) {
            resultSet = (ArrayList<Integer>)resultSetInter.clone();
            maxResult = maxResultInter;
            maxResultInter = 0;
        } else if((maxResultInter == maxResult) && (resultSetInter.size() > resultSet.size())) {
            resultSet = (ArrayList<Integer>)resultSetInter.clone();
            maxResultInter = 0;
        }
        return resultSet;
    }
}
