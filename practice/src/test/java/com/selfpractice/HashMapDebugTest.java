package com.selfpractice;


import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import practice.utils.HashMap;

@RunWith(SpringRunner.class)
public class HashMapDebugTest {

    @Test
    public void testHashMap() {
       Map<Employee,String> m = new HashMap<>();
       for(int i =1;i<=100;i++)
    	   m.put(new Employee(i), Integer.toString(i));
       System.out.println(m);
       Assert.assertEquals(100, m.size());
	}

}