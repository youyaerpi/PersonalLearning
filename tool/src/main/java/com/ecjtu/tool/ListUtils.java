package com.ecjtu.tool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author xiexiang
 * @date : 2019/06/29 12:15
 */
public class ListUtils {
    /**
     * 将list集合按n个数划分
     *
     * @param source 源集合
     * @param n      划分个数
     * @param <T>    范型
     * @return 目标集合
     */
    public static <T> List<List<T>> averageAssign(List<T> source, int n) {
        if (n <= 0) {
            return Collections.emptyList();
        }
        List<List<T>> list = new ArrayList<>();
        int sourceSize = source.size();

        int finalNum = n;
        for (int i = 0; i < sourceSize; i += n) {
            if (i + n > sourceSize) {
                finalNum = sourceSize - i;
            }
            list.add(source.subList(i, i + finalNum));
        }
        return list;
    }
}
