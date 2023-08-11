package com.murmylo.volodymyr.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new LinkedList<>();
            list.add(1);
            for (int j = 1; j < i; j++) {
                List<Integer> listAbove = triangle.get(i - 1);
                list.add(listAbove.get(j - 1) + listAbove.get(j));
            }
            if (i > 0) {
                list.add(1);
            }
            triangle.add(list);
        }
        return triangle;
    }
}
