package com.selfpractice;

import java.util.List;
import java.util.stream.Collectors;

public class ListIntersection { 
    public List<String> intersect(List<String> list1,List<String> list2){
        return list1.parallelStream().filter(list2::contains).collect(Collectors.toList());
    }
}