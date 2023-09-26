package com.sarunas.test;

import static org.junit.jupiter.api.Assertions.*;

import com.sarunas.FrequencyData;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

class FrequencyDataTest {
    private FrequencyData frequencyData;

    @Test
    public void calculateFrequencyInListTest1() {
        List<Integer> inputList = List.of(1, 4, 1, 5, 8, 1, 3, 5, 1, 4, 1, 3, 7, 2);
        frequencyData = new FrequencyData(inputList);
        Map<Integer, Integer> actualResult = frequencyData.calculateFrequencyInList();
        assertEquals(5, actualResult.get(1));
        assertEquals(1, actualResult.get(2));
        assertEquals(2, actualResult.get(3));
        assertEquals(2, actualResult.get(4));
        assertEquals(2, actualResult.get(5));
        assertEquals(0, actualResult.get(6));
        assertEquals(1, actualResult.get(7));
        assertEquals(1, actualResult.get(8));

        Map<Integer, Integer> expectedResult =
                Map.of(1 , 5 , 2, 1, 3, 2, 4, 2, 5, 2, 6, 0, 7, 1, 8, 1);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateFrequencyInListTest2() {
        List<Integer> inputList = List.of(2, 4, 5, 5, 9, 3);
        frequencyData = new FrequencyData(inputList);
        Map<Integer, Integer> actualResult = frequencyData.calculateFrequencyInList();
        Map<Integer, Integer> expectedResult =
                Map.of(2, 1, 3, 1, 4, 1, 5, 2, 6, 0, 7, 0, 8, 0, 9, 1);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateFrequencyInListTest3() {
        List<Integer> inputList = List.of(1, 4);
        frequencyData = new FrequencyData(inputList);
        Map<Integer, Integer> actualResult = frequencyData.calculateFrequencyInList();
        Map<Integer, Integer> expectedResult =
                Map.of(1, 1, 2, 0, 3, 0, 4, 1);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateNotCorrectFrequencyInListTest() {
        List<Integer> inputList = List.of(1, 5);
        frequencyData = new FrequencyData(inputList);
        Map<Integer, Integer> actualResult = frequencyData.calculateFrequencyInList();
        Map<Integer, Integer> expectedResult =
                Map.of(1, 1, 2, 2, 3, 2, 4, 4);
        assertNotEquals(expectedResult, actualResult);
    }
}




