package com.selfpractice;


import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ListIntersectionTest {
    private static final long EXPECTED_DURATION = TimeUnit.NANOSECONDS.convert(150, TimeUnit.MILLISECONDS);
    private ListIntersection listIntersection = new ListIntersection();
    private static final int MAX_ARR = 10000;

    @Test
    public void testListIntersectionWithPerf() {
        List<String> l1 = ThreadLocalRandom.current().ints().limit(MAX_ARR).mapToObj(i -> Integer.toString(i))
                .collect(Collectors.toList());
        List<String> l2 = ThreadLocalRandom.current().ints().limit(MAX_ARR).mapToObj(i -> Integer.toString(i))
                .collect(Collectors.toList());
        long startTime = System.nanoTime();
        List<String> receivedList = listIntersection.intersect(l1, l2);
        long timeTaken = System.nanoTime() - startTime;
        long timeTakenInMilis = TimeUnit.MILLISECONDS.convert(timeTaken, TimeUnit.NANOSECONDS);
        System.out.println("total time taken" + timeTakenInMilis);
        Assert.assertTrue("took too much time " + timeTakenInMilis + " ms",
                timeTaken < EXPECTED_DURATION);
        List<String> expectedList = l1.stream().filter(l2::contains).collect(Collectors.toList());
        expectedList.forEach((l)->{
            Assert.assertTrue(receivedList.contains(l));
        });
	}

}