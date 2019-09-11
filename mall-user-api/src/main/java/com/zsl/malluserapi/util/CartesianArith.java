package com.zsl.malluserapi.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartesianArith {

    public static <T> List<List<T>> cartesianProduct(T[]... sets) {
        if (sets == null || sets.length == 0) {
            return Collections.emptyList();
        }
        int total = 1;
        //声明进位指针cIndex
        int cIndex = sets.length - 1;
        //声明counterMap(角标 - counter)
        int[] counterMap = new int[sets.length];
        for (int i = 0; i < sets.length; i++) {
            counterMap[i] = 0;
            total *= (sets[i] == null || sets[i].length == 0 ? 1 : sets[i].length);
        }
        List<List<T>> rt = new ArrayList<>(total);
        //开始求笛卡尔积
        while (cIndex >= 0) {
            List<T> element = new ArrayList<>(sets.length);
            for (int j = 0; j < sets.length; j++) {
                T[] set = sets[j];
                //忽略空集
                if (set != null && set.length > 0) {
                    element.add(set[counterMap[j]]);
                }
                //从末位触发指针进位
                if (j == sets.length - 1) {
                    if (set == null || ++counterMap[j] > set.length - 1) {
                        //重置指针
                        counterMap[j] = 0;
                        //进位
                        int cidx = j;
                        while (--cidx >= 0) {
                            //判断如果刚好前一位也要进位继续重置指针进位
                            if (sets[cidx] == null || ++counterMap[cidx] > sets[cidx].length - 1) {
                                counterMap[cidx] = 0;
                                continue;
                            }
                            break;
                        }
                        if (cidx < cIndex) {
                            //移动进位指针
                            cIndex = cidx;
                        }
                    }
                }
            }
            if (element.size() > 0) {
                rt.add(element);
            }
        }
        return rt;
    }

    public static ArrayList Dikaerji0(ArrayList al0) {
        ArrayList a0 = (ArrayList) al0.get(0);// l1  
        ArrayList result = new ArrayList();// 组合的结果  
        if(al0.size() == 1){
            return a0;
        }
        for (int i = 1; i < al0.size(); i++) {
            ArrayList a1 = (ArrayList) al0.get(i);
            ArrayList temp = new ArrayList();
            // 每次先计算两个集合的笛卡尔积，然后用其结果再与下一个计算  
            for (int j = 0; j < a0.size(); j++) {
                for (int k = 0; k < a1.size(); k++) {
                    ArrayList cut = new ArrayList();

                    if (a0.get(j) instanceof ArrayList) {
                        cut.addAll((ArrayList) a0.get(j));
                    } else {
                        cut.add(a0.get(j));
                    }
                    if (a1.get(k) instanceof ArrayList) {
                        cut.addAll((ArrayList) a1.get(k));
                    } else {
                        cut.add(a1.get(k));
                    }
                    temp.add(cut);
                }
            }
            a0 = temp;
            if (i == al0.size() - 1) {
                result = temp;
            }
        }
        return result;
    }
  /*  public static void main(String args[]) {
        System.out.println(Arrays.deepToString(
                cartesianProduct(
                        new String[]{"a", "b"}, new String[]{"0", "1", "2"}, new String[]{"0", "1", "2"}, new String[]{"0", "1", "2"}, new String[]{"0", "1", "2"}, new String[]{"0", "1", "2"}
                ).toArray()));
    }*/

}