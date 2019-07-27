package com.selfpractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ListIntersection {
    public List<String> intersect(List<String> list1,List<String> list2){
    HashSet<String> h1 = new HashSet<String>(list1);
    HashSet<String> h2 = new HashSet<String>(list2);

    h1.retainAll(h2);
    List<String> l1 = new ArrayList<String>(h1); 
    return l1;
    }
}