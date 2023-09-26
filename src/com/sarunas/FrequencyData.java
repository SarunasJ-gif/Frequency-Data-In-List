package com.sarunas;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyData {
    private List<Integer> dataList;

    public FrequencyData(List<Integer> dataList) {
        this.dataList = dataList;
    }

    public Map<Integer, Integer> calculateFrequencyInList() {
        int minValue = Collections.min(dataList);
        int maxValue = Collections.max(dataList);

        Map<Integer, Integer> frequencyDataMap = getFrequencyDataFromInputList(minValue, maxValue, dataList);
        printAllNumbers(minValue, maxValue);
        printFrequencyData(minValue, maxValue, frequencyDataMap);
        return frequencyDataMap;
    }

    private Map<Integer, Integer> getFrequencyDataFromInputList(int minValue, int maxValue, List<Integer> listOfNumbers) {
        Map<Integer, Integer> dataMap = new HashMap<>();
        for (int i = minValue; i <= maxValue; i++) {
            dataMap.put(i, 0);
        }
        for (int number : listOfNumbers) {
            dataMap.put(number, dataMap.get(number) + 1);
        }
        return dataMap;
    }

    private void printAllNumbers(int minValue, int maxValue) {
        System.out.println("Number: ");
        for (int i = minValue; i <= maxValue; i++) {
            System.out.print(i + " ");
        }
    }

    private void printFrequencyData(int minValue, int maxValue, Map<Integer, Integer> frequencyDataMap) {
        System.out.println("\nFrequency: ");
        for (int i = minValue; i <= maxValue; i++) {
            System.out.print(frequencyDataMap.get(i) + " ");
        }
    }



}
