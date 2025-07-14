package org.example;
import java.util.ArrayList;
import java.util.List;

public class ListZipper {

    public static <T> List<T> zip(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();
        int minSize = Math.min(list1.size(), list2.size());

        // Alternate elements from each list
        for (int i = 0; i < minSize; i++) {
            result.add(list1.get(i));
            result.add(list2.get(i));
        }

        // Add remaining elements from longer list
        if (list1.size() > minSize) {
            result.addAll(list1.subList(minSize, list1.size()));
        } else if (list2.size() > minSize) {
            result.addAll(list2.subList(minSize, list2.size()));
        }

        return result;
    }
}
