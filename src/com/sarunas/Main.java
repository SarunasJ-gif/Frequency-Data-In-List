package com.sarunas;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    if (args.length > 0) {
        List<Integer> inputDataList = new ArrayList<>();
	    for (String arg : args) {
	        try {
                inputDataList.add(Integer.parseInt(arg));
            } catch (NumberFormatException e) {
	            continue;
            }
        }
	    FrequencyData data = new FrequencyData(inputDataList);
	    Map<Integer, Integer> dataMap = data.calculateFrequencyInList();
        DataGraph graph = new DataGraph(dataMap);
        graph.printDataGraph();
        }
    }
}
