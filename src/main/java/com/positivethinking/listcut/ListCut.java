package com.positivethinking.listcut;

import java.util.ArrayList;
import java.util.List;

public class ListCut {

    //Recursive Solution more Funny and fast O(log(n))
    public static List<List<Integer>> cutListOpt(List<Integer> list, int n) {
        if (list == null || list.isEmpty() || n <= 0) {
            return new ArrayList<>();
        } else {
            if (n > list.size()) {
                return cutList(list, list.size());
            }
            if (n == list.size()) {
                var result = new ArrayList<List<Integer>>();
                result.add(list);
                return result;
            } else {
                var result1 = list.subList(0, n);
                var result2 = cutListOpt(list.subList(n, list.size()), n);
                result2.add(0, result1);
                return result2;
            }
        }
    }

    //Iterative solution 0(n)
    public static List<List<Integer>> cutList(List<Integer> list, int n) {
        if (list == null || list.isEmpty() || n <= 0) {
            return new ArrayList<>();
        } else {
            if (n > list.size()) {
                return cutList(list, list.size());
            }
            var result = new ArrayList<List<Integer>>();
            var li = new ArrayList<Integer>();

            for (Integer integer : list) {
                li.add(integer);
                if (li.size() == n) {
                    result.add(li);
                    li = new ArrayList<>();
                }
            }
            if (!li.isEmpty()) result.add(li);
            return result;
        }
    }
}
