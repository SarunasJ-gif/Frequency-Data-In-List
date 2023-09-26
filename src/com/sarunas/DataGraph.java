package com.sarunas;

import java.util.Map;

public class DataGraph {
    private Map<Integer, Integer> dataMap;

    public DataGraph(Map<Integer, Integer> dataMap) {
        this.dataMap = dataMap;;
    }

    public void printDataGraph() {
        int maxValue = dataMap.keySet().stream().mapToInt(Integer::intValue).max().orElse(0);
        int minValue = dataMap.keySet().stream().mapToInt(Integer::intValue).min().orElse(0);
        for (int i = maxValue; i >= minValue ; i--) {
            for (int key : dataMap.keySet()) {
                int number = dataMap.get(key);
                if (number >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int key : dataMap.keySet()) {
            System.out.print(key + " ");
        }
    }
}
