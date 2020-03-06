package com.imooc.sort;

import java.util.Comparator;

public class AgeComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        //按年龄降序排序
        Integer age1 = o1.getMonth();
        Integer age2 = o2.getMonth();
        int n = age2.compareTo(age1);

        return n;
    }
}
