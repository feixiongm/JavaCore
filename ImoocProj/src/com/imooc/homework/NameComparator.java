package com.imooc.homework;

import java.util.Comparator;

public class NameComparator implements Comparator<SortStudent> {

    @Override
    public int compare(SortStudent o1, SortStudent o2) {
        String name1 = o1.getName();
        String name2 = o2.getName();

        return name1.compareTo(name2);
    }
}
