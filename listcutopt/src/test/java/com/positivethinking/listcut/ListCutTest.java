package com.positivethinking.listcut;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static junit.framework.TestCase.assertEquals;


public class ListCutTest {


    @Test
    public void testCutList() {
        var list = IntStream.range(1, 5).boxed().collect(Collectors.toList());

        var n0 = 0;
        var n1 = 1;
        var n2 = 2;
        var n3 = 3;
        var n4 = 4;
        var n5 = 7;

        assertEquals(new ArrayList<>(), ListCut.cutList(list, n0));
        assertEquals(List.of(List.of(1), List.of(2), List.of(3), List.of(4)), ListCut.cutList(list, n1));
        assertEquals(List.of(List.of(1, 2), List.of(3, 4)), ListCut.cutList(list, n2));
        assertEquals(List.of(List.of(1, 2, 3), List.of(4)), ListCut.cutList(list, n3));
        assertEquals(List.of(List.of(1, 2, 3, 4)), ListCut.cutList(list, n4));
        assertEquals(List.of(List.of(1, 2, 3, 4)), ListCut.cutList(list, n5));

    }

    @Test
    public void testCutListOpt() {
        var list = IntStream.range(1, 5).boxed().collect(Collectors.toList());

        var n0 = 0;
        var n1 = 1;
        var n2 = 2;
        var n3 = 3;
        var n4 = 4;
        var n5 = 7;

        assertEquals(new ArrayList<>(), ListCut.cutListOpt(list, n0));
        assertEquals(List.of(List.of(1), List.of(2), List.of(3), List.of(4)), ListCut.cutListOpt(list, n1));
        assertEquals(List.of(List.of(1, 2), List.of(3, 4)), ListCut.cutListOpt(list, n2));
        assertEquals(List.of(List.of(1, 2, 3), List.of(4)), ListCut.cutListOpt(list, n3));
        assertEquals(List.of(List.of(1, 2, 3, 4)), ListCut.cutListOpt(list, n4));
        assertEquals(List.of(List.of(1, 2, 3, 4)), ListCut.cutListOpt(list, n5));

    }

}
